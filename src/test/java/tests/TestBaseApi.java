package tests;

import config.web.ProjectConfiguration;
import config.web.LaunchConfig;
import config.web.LaunchConfigReader;
import org.junit.jupiter.api.BeforeAll;

public class TestBaseApi {

    private static final LaunchConfig CONFIG = LaunchConfigReader.Instance.read();

    @BeforeAll
    static void setUp() {
        ProjectConfiguration projectConfiguration = new ProjectConfiguration(CONFIG);
        projectConfiguration.apiConfig();
    }
}
