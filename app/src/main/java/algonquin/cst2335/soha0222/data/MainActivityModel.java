package algonquin.cst2335.soha0222.data;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityModel extends ViewModel {
    public String editString;
    public MutableLiveData<Boolean> isSelected = new MutableLiveData<>();

}
