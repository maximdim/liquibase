package liquibase.parser.core.xml;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RegexResourceFilterTest {

  @Test
  public void test() {
    
    List<String> files = new ArrayList<String>();
    files.add("/foo/bar.txt");
    files.add("/a/b/c/1.sql");
    files.add("fix.sql");
    files.add("/a/sql/b.txt");
    files.add("sql.txt");
    
    RegexResourceFilter filter = new RegexResourceFilter();
    List<String> filtered = filter.filter(files, null);
    assertEquals(2, filtered.size());
    assertTrue(filtered.contains("/a/b/c/1.sql"));
    assertTrue(filtered.contains("fix.sql"));
  }

}
