package no.roligheten.officeShelf.configs

import no.roligheten.officeShelf.bookProviders.BookProvider
import no.roligheten.officeShelf.bookProviders.PlaceholderBookProvider
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@EnableJpaRepositories("no.roligheten.officeShelf.repositories")
class OfficeShelfApplicationConfig {

    @Bean
    fun bookProvider(): BookProvider {
        return PlaceholderBookProvider()
    }
}