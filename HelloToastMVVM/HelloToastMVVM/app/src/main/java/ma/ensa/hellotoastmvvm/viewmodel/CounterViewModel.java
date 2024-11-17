package ma.ensa.hellotoastmvvm.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {

    private final MutableLiveData<Integer> counter = new MutableLiveData<>(0);

    public LiveData<Integer> getCounter() {
        return counter;
    }

    public void incrementCounter() {
        Integer currentCounter = counter.getValue();
        if (currentCounter != null) {
            counter.setValue(currentCounter + 1);  // Incrémente le compteur
        }
    }

    public void decrementCounter() {
        Integer currentCounter = counter.getValue();
        if (currentCounter != null) {
            counter.setValue(currentCounter - 1);  // Décrémente le compteur
        }
    }

    public void resetCounter() {
        counter.setValue(0);  // Réinitialise le compteur à 0
    }
}
