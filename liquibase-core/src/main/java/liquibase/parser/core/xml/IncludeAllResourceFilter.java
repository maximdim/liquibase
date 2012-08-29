package liquibase.parser.core.xml;

import liquibase.servicelocator.PrioritizedService;

import java.util.List;

/**
 * @author Sergey Vasilyev
 */
public interface IncludeAllResourceFilter {
	List<String> filter(List<String> includedChangeLogs);
}
