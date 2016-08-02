package liquibase.parser.core.xml;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import liquibase.changelog.ChangeLogParameters;

/**
 * Filter by regular expression. Unfortunately there seems no way to pass regex to the filter as a parameter   
 */
public class RegexResourceFilter implements IncludeAllFilter {
  private final static Pattern PATTERN = Pattern.compile(".*\\.sql$");

  public List<String> filter(List<String> includedChangeLogs, ChangeLogParameters changeLogParameters) {
    if (includedChangeLogs == null || includedChangeLogs.isEmpty()) {
      return includedChangeLogs;
    }
    
    List<String> result = new ArrayList<String>();
    for(String fileName: includedChangeLogs) {
      Matcher matcher = PATTERN.matcher(fileName);
      if (matcher.matches()) {
        result.add(fileName);
      }
    }
    return result;
  }

}
