package market.util;

import org.hibernate.Hibernate;
import org.hibernate.dialect.MySQLDialect;

import java.sql.Types;

public class CustomDialect extends MySQLDialect{

   public CustomDialect () {   

         super();   

         registerHibernateType(Types.DECIMAL,   

          Hibernate.BIG_DECIMAL.getName());   

          registerHibernateType(-1, Hibernate.STRING.getName());

     }  

}
