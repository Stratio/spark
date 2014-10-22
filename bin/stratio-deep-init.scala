//Commmons
import com.stratio.deep.commons.annotations._
import com.stratio.deep.commons.config._
import com.stratio.deep.commons.entity._


//Core
import com.stratio.deep.core.context._
import com.stratio.deep.core.entity._

//Cassandra
import com.stratio.deep.cassandra.config._
import com.stratio.deep.cassandra.entity._
import com.stratio.deep.cassandra.extractor._
import com.stratio.deep.cassandra.testentity._

//MongoDB
import com.stratio.deep.mongodb.config._
import com.stratio.deep.mongodb.extractor._


//ES
import com.stratio.deep.es.config._
import com.stratio.deep.es.extractor._


//Apache-Cassandra
import org.apache.cassandra.db.marshal.Int32Type;
import org.apache.cassandra.db.marshal.LongType;


//Spark
import org.apache.spark.rdd._
import org.apache.spark.SparkContext._

//Scala
import scala.collection.JavaConversions._



val deepContext = new DeepSparkContext(sc)
