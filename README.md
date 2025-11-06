Spring Boot Nedir?

Spring Boot, Java tabanlı en popüler framework olan Spring Framework üzerine inşa edilmiş, production-ready (prodüksiyonda kullanıma hazır) uygulamaları hızlı ve kolay bir şekilde geliştirmeyi amaçlayan bir araçtır.
Temel Amacı

Spring Boot'un ana amacı, Spring tabanlı uygulamaların geliştirilmesini basitleştirmek ve hızlandırmaktır. Geliştiricinin:

    Daha az konfigürasyon yapmasını

    Daha hızlı uygulama geliştirmesini

    Standart yapılar kullanmasını sağlar

2. Gömülü Web Sunucuları

   Tomcat, Jetty veya Undertow gibi web sunucularını içerir

   WAR dosyası oluşturmaya gerek kalmadan standalone uygulama çalıştırır

   - Tek dependency ile ilgili tüm bağımlılıkları otomatik ekler

   - spring-boot-starter-data-jpa, spring-boot-starter-security vb.

- @SpringBootApplication
  public class Application {
  public static void main(String[] args) {
  SpringApplication.run(Application.class, args);
  }
  }

  2. @SpringBootApplication Anotasyonu

Bu anotasyon aslında 3 önemli anotasyonu içerir:

@SpringBootConfiguration // Konfigürasyon sınıfı olduğunu belirtir
@EnableAutoConfiguration // Otomatik konfigürasyonu aktif eder
@ComponentScan // Bean'leri taramayı aktif eder

📦 Starter'ların Çalışma Mantığı
spring-boot-starter-web kullandığınızda:

    Tomcat dependency'si eklenir

    Spring Boot Tomcat'i algılar

    Web sunucusunu otomatik başlatır

    Spring MVC konfigürasyonunu yapar

    8080 portunda uygulamayı hazır hale getirir

🏗️ Application Context Oluşumu
Adım Adım Süreç:

    SpringApplication.run() çağrılır

    Application Context oluşturulur

    @ComponentScan tüm bileşenleri tarar:

        @Component, @Service, @Repository, @Controller

    @EnableAutoConfiguration devreye girer:

        META-INF/spring.factories dosyalarını okur

        Auto-configuration sınıflarını yükler

    Bean'ler oluşturulur ve context'e yerleştirilir

    Embedded Web Server başlatılır

    Uygulama hazır hale gelir

⚙️ Auto-Configuration Detayları
spring.factories Dosyası Örneği:
text

# Auto Configure

org.springframework.boot.autoconfigure.EnableAutoConfiguration=\
org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration,\
org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration,\
org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration

Conditional Anotasyonları:

    @ConditionalOnClass → Sınıf classpath'te varsa

    @ConditionalOnProperty → Property set edilmişse

    @ConditionalOnBean → Bean mevcutsa

    @ConditionalOnMissingBean → Bean yoksa

Maven Nedir?

Maven, Java projeleri için geliştirilmiş bir build automation tool (yapılandırma otomasyon aracı) ve dependency management (bağımlılık yönetim) aracıdır.
Temel Amacı

    Proje oluşturma ve yönetme

    Bağımlılıkları yönetme (kütüphane, framework)

    Proje yaşam döngüsünü standartlaştırma

    Build süreçlerini otomatikleştirme

    🏗️ Maven'ın Çalışma Mantığı

Dependency Çözümleme Süreci:

    pom.xml'de dependency tanımlanır

    Maven önce local repository'e bakar

    Yoksa central repository'den indirir

    Local repository'ye kopyalar

    Projede kullanıma hazır hale getirir
