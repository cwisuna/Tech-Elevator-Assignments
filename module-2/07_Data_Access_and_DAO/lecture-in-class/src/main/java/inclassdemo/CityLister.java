package inclassdemo;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.ArrayList;
import java.util.List;

public class CityLister {

    public static void main(String[] args) {
        // Datasource
        BasicDataSource usaDataSource = new BasicDataSource();
        usaDataSource.setUrl("jdbc:postgresql://localhost:5432/UnitedStates");
        usaDataSource.setUsername("postgres");
        usaDataSource.setPassword("postgres1");

        //JDBCTemplate
        JdbcTemplate jdbcTemplate = new JdbcTemplate(usaDataSource);
        String sql =
                    "SELECT   city.city_id, city.city_name, " +
                            " city.population as num_folks , " +
                            " city.area , " +
                            " city.state_abbreviation, " +
                            " state.state_name" +
                        " FROM city " +
                        " INNER JOIN state " +
                        "   ON state.state_abbreviation = city.state_abbreviation " +
                        " WHERE city.state_abbreviation = ? " +
                        " AND city.population > ? " +
                        " ORDER BY city.city_name ;";

        SqlRowSet sqlResult = jdbcTemplate.queryForRowSet(sql, "NY", 100000 ) ;

        List<City> cities = new ArrayList<>() ;

        // SQLRowset
        while (sqlResult.next()){
            cities.add(cityMapper(sqlResult));
        }

        for (City city: cities){
            System.out.println(city.toString());
        }

    }

    private static City cityMapper(SqlRowSet sqlResult) {
        City newCity = new City();

        newCity.setCityId( sqlResult.getInt("city_id") );
        newCity.setCityName( sqlResult.getString("city_name"));
        newCity.setPopulation( sqlResult.getInt("num_folks"));
        newCity.setStateAbbreviation( sqlResult. getString("state_abbreviation"));
        newCity.setState_name( sqlResult.getString("state_name"));
        newCity.setArea( sqlResult.getDouble("area"));
        return newCity;
    }
}
