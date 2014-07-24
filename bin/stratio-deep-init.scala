import com.stratio.deep.annotations.DeepEntity;
import com.stratio.deep.annotations.DeepField;
import com.stratio.deep.entity.IDeepType;
import org.apache.cassandra.db.marshal.Int32Type;
import org.apache.cassandra.db.marshal.LongType;
import com.stratio.deep.config._
import com.stratio.deep.config.{CassandraConfigFactory=>Cfg};
import com.stratio.deep.config.{MongoConfigFactory=>Mcfg_};
import com.stratio.deep.entity._;
import com.stratio.deep.context._;
import com.stratio.deep.rdd._;
import com.stratio.deep.rdd.mongodb._;
import com.stratio.deep.testentity._;
import org.apache.spark.rdd.RDD;

val cassandraDeepContext = new CassandraDeepSparkContext(sc);
val mongoDeepContext = new MongoDeepSparkContext(sc);
