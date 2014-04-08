import com.stratio.deep.annotations.DeepEntity;
import com.stratio.deep.annotations.DeepField;
import com.stratio.deep.entity.IDeepType;
import org.apache.cassandra.db.marshal.Int32Type;
import org.apache.cassandra.db.marshal.LongType;
import com.stratio.deep.config._;
import com.stratio.deep.entity._;
import com.stratio.deep.context._;
import com.stratio.deep.rdd._

val deepContext = new DeepSparkContext(sc)

