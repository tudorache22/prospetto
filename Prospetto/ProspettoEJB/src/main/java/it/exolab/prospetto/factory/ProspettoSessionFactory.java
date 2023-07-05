package it.exolab.prospetto.factory;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class ProspettoSessionFactory {

    private static SqlSessionFactory sessionfactory;

    public static SqlSessionFactory getSessionFactory() throws IOException {
//		org.apache.ibatis.logging.LogFactory.useSlf4jLogging();


        String environment = "development";

        return getSessionFactory(environment);
    }

    public static SqlSessionFactory getSessionFactory(String environment) throws IOException {

        if (sessionfactory == null){
            //path mybatis
            String resource = "config/mybatis-config.xml";

            Reader reader = Resources.getResourceAsReader(resource);

            sessionfactory = new SqlSessionFactoryBuilder().build(reader,environment);

        }
        return sessionfactory;
    }
}
