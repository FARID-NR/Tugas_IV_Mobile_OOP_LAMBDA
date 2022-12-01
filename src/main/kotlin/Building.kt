open class Building (marketPrice : Double) {
//    init {
//        println("Current Market value is $marketPrice")
//    }

    protected open var owner : String = ""
    open val rooms : Int = 0
    open val bathrooms : Double = 0.0
    open var color : String = ""

//    override val maintenanceStatus: String = ""


    open fun ownerPrompt(){
        println("pemiliknya : $owner")
    }

//    override val floorAmount: Int = 0

//    override val buildingStaff: Map<Int, String> = mapOf()


//    override fun buildingPrompt() {
//        println("Selamat datang di Gedung saya")
//    }

}