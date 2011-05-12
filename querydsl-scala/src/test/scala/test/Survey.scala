package test;

import scala.reflect.BeanProperty;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import com.mysema.query.sql.Column;

/**
 * Survey is a Querydsl bean type
 */
@com.mysema.query.sql.Schema("PUBLIC")
@com.mysema.query.sql.Table("SURVEY")
class Survey {

  @Column("ID")
  @NotNull
  @BeanProperty var id: Integer = _;

  @Column("NAME")
  @NotNull
  @Size(max=30)
  @BeanProperty var name: String = _;

}

