package cp.fr.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Formation on 19/01/2018.
 */

public class Converter extends BaseObservable {

    private Double euro;
    private Double yen;

    public Converter(){
    }

    public Converter(Double euro ) {
      this.euro = euro;
      this.yen = this.euro*135.788;

    }

    @Bindable
    public String getEuro() {
        return String.valueOf(euro);
    }

    public Converter setEuro (String euro) {
        if (! euro.equals("")){
        this.euro = Double.valueOf(euro);
        notifyPropertyChanged(cp.fr.databinding.BR.yen);}
        else{this.yen=0.00;}
        this.yen = this.euro * 135.788;
        return this;
    }

    @Bindable
    public String getYen() {
        return String.valueOf(this.yen);
    }

    public Converter setYen(String yen) {

        this.yen = Double.valueOf(yen);
        //notifyPropertyChanged(cp.fr.databinding.BR.yen);
        return this;
    }
}
