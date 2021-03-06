import link.kotlin.scripts.dsl.Article
import link.kotlin.scripts.dsl.LinkType.slides
import link.kotlin.scripts.dsl.LanguageCodes.EN
import java.time.LocalDate.of

val body = """
[Slides](https://speakerdeck.com/dmytrodanylyk/kotlin-plus-android)
"""

Article(
    title = "Kotlin + Android",
    url = "https://speakerdeck.com/dmytrodanylyk/kotlin-plus-android",
    categories = listOf(
        "Kotlin",
        "Android"
    ),
    type = slides,
    lang = EN,
    author = "Dmytro Danylyk",
    date = of(2016, 4, 21),
    body = body
)
