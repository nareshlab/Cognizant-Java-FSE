class Singleton private constructor() {
    companion object {
        val instance = SingletonHolder.INSTANCE
    }

    private object SingletonHolder {
        val INSTANCE = Singleton()
    }
}
