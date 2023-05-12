package BeanInstantiation;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.cglib.proxy.Factory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFactoryBean implements FactoryBean {
    private String strDate;
    public DateFactoryBean(String date){
        strDate = date;
    }

    @Override
    public Object getObject() throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(strDate);
        return date;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
