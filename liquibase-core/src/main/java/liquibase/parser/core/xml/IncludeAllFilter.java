package liquibase.parser.core.xml;

import liquibase.changelog.ChangeLogParameters;

import java.util.List;

public interface IncludeAllFilter {
    List<String> filter(List<String> includedChangeLogs, ChangeLogParameters changeLogParameters);
}