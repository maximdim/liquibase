package liquibase.parser.core.xml;

import liquibase.Liquibase;
import liquibase.servicelocator.PrioritizedService;

import java.util.List;

/**
 * @author Sergey Vasilyev
 */
public interface IncludeAllResourceFilter {
	List<String> filter(List<String> includedChangeLogs);

    /**
     * Ссылка на liquibase объект.
     * @param liquibase
     */
    void setLiquibase(Liquibase liquibase);
}
