object ApplicationId {
    val id = "com.mercadolibre.dashboard"
}

object Modules {
    val app = ":app"

    val navigation = ":navigation"

    val common = ":common"
    val commonTest = ":common_test"

    val local = ":data:local"
    val remote = ":data:remote"
    val model = ":data:model"
    val repository = ":data:repository"

    val featureHome = ":features:home"
    val featureDetail = ":features:detail"
}

object Releases {
    val versionCode = 1
    val versionName = "1.0"
}

object Versions {
    val androidJunit = "1.1.1"
    val androidTestRunner = "1.1.2-alpha02"
    val appCompat = "1.1.0"
    val archCoreTest = "2.1.0"
    val compileSdk = 28
    val constraintLayout = "1.1.3"
    val coreKtx = "1.2.0"
    val coroutines = "1.1.1"
    val databinding = "3.3.2"
    val espressoCore = "3.2.0-alpha02"
    val fragmentTest = "1.1.0-alpha06"
    val glide = "4.9.0"
    val gradle = "4.0.0"
    val gson = "2.8.5"
    val koin = "1.0.2"
    val kotlin = "1.3.61"
    val lifecycle = "2.2.0"
    val minSdk = 26
    val mockk = "1.9.2"
    val mockwebserver = "2.7.5"
    val nav = "2.0.0"
    val okHttp = "4.5.0"
    val recyclerview = "1.0.0"
    val retrofit = "2.6.0"
    val retrofitCoroutines = "0.9.2"
    val room = "2.2.5"
    val safeArgs = "2.1.0-alpha01"
    val swiper = "1.0.0"
    val targetSdk = 28
}

object Libraries {
    // KOIN
    val koin = "org.koin:koin-android:${Versions.koin}"
    val koinViewModel = "org.koin:koin-android-viewmodel:${Versions.koin}"
    // ROOM
    val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    val roomRunTime = "androidx.room:room-runtime:${Versions.room}"
    val roomKtx = "androidx.room:room-ktx:${Versions.room}"
    // RETROFIT
    val retrofitCoroutineAdapter = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.retrofitCoroutines}"
    val gson = "com.google.code.gson:gson:${Versions.gson}"
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    val httpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
    // GLIDE
    val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
}

object KotlinLibraries {
    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    val kotlinCoroutineCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
}

object AndroidLibraries {
    // KOTLIN
    val kotlinCoroutineAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    // ANDROID
    val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

    // LIFECYCLE
    val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"

    // RECYCLER AND MORE
    val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
    val swiper = "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swiper}"

    // NAVIGATION
    val navigation = "androidx.navigation:navigation-ui-ktx:${Versions.nav}"
    val navigationFrag = "androidx.navigation:navigation-fragment-ktx:${Versions.nav}"
}

object TestLibraries {
    // ANDROID TEST
    val androidTestRunner = "androidx.test:runner:${Versions.androidTestRunner}"
    val espresso = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    val espressoContrib = "androidx.test.espresso:espresso-contrib:${Versions.espressoCore}"
    val archCoreTest = "androidx.arch.core:core-testing:${Versions.archCoreTest}"
    val junit = "androidx.test.ext:junit:${Versions.androidJunit}"
    val fragmentNav = "androidx.fragment:fragment-testing:${Versions.fragmentTest}"
    // KOIN
    val koin = "org.koin:koin-test:${Versions.koin}"
    // MOCK WEBSERVER
    val mockWebServer = "com.squareup.okhttp:mockwebserver:${Versions.mockwebserver}"
    // MOCK
    val mockkAndroid = "io.mockk:mockk-android:${Versions.mockk}"
    val mockk = "io.mockk:mockk:${Versions.mockk}"
    // COROUTINE
    val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
    // DATA BINDING
    val databinding = "androidx.databinding:databinding-compiler:${Versions.databinding}"
}