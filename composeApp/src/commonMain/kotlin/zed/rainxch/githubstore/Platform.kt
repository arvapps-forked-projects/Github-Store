package zed.rainxch.githubstore

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform