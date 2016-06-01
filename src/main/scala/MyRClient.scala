
import org.ddahl.rscala.callback.RClient
import org.joda.time.DateTime

class MyRClient () {
	
	System.out.println("Before instantiating RClient : " + new DateTime().toString())
	val Re = RClient()
	System.out.println("After instantiating RClient : " + new DateTime().toString())
}