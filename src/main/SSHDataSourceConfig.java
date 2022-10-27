@Slf4j
@Profile("local")
@Configuration
@RequiredArgsConstructor
public class SshDataSourceConfig {

    private final SshTunnelingInitializer initializer;

    @Bean("dataSource")
    @Primary
    public DataSource dataSource(DataSourceProperties properties) {

        Integer forwardedPort = initializer.buildSshConnection();  // ssh 연결 및 터널링 설정
        String url = properties.getUrl().replace("[forwardedPort]", Integer.toString(forwardedPort));
        log.info(url);
        return DataSourceBuilder.create()
                .url(url)
                .username(properties.getUsername())
                .password(properties.getPassword())
                .driverClassName(properties.getDriverClassName())
                .build();
    }

}
