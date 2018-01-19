package cp.fr.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Formation on 19/01/2018.
 */

public class Person extends BaseObservable{

    private String name;

    private String firstname;

    @Bindable
    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        notifyPropertyChanged(cp.fr.databinding.BR.name);
        return this;
    }

    @Bindable
    public String getFirstname() {
        return firstname;
    }

    public Person setFirstname(String firstname) {

        this.firstname = firstname;
        notifyPropertyChanged(cp.fr.databinding.BR.firstname);
        return this;
    }

    public Person() {
    }

    public Person(String name, String firstname) {
        this.name = name;
        this.firstname = firstname;
    }
}
