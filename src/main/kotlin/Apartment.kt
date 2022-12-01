class Apartment(
    override var owner : String,
    override val rooms : Int,
    override val bathrooms: Double,
    override var color: String,
//    override val floorAmount: Int,

    price : Double,
    tenants : Map<Int, String>,

) : Building(price) {

    private var tenants = mapOf<Int, String>()


    init {
        this.tenants = tenants
    }

//    override fun buildingPrompt() {
//        super.buildingPrompt()
//    }

    fun printTenant(id : Int){
        if (tenants[id] != null) {
            println("Penyewa saat ini adalah ${tenants[id]}")
        }else {
            println("Tidak ada penyewa saat ini yang tinggal di sana")
        }
    }
}