package cico.example.me.demoedittext;

import android.text.InputFilter;
import android.text.Spanned;

/**
 * Created by me on 10/7/16.
 */
public class InputFilterMinMax implements InputFilter {

    private float min, max;

    public InputFilterMinMax(String min, String max) {
        this.min = Float.parseFloat(min);
        this.max = Float.parseFloat(max);
    }
    private boolean isInRange(float a, float b, float c, int length) {
        if (length>5)
            return false;
        return b > a ? c >= a && c <= b : c >= b && c <= a;
    }

    @Override
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
        try {
            float input = Float.parseFloat(dest.toString() + source.toString());
            if (isInRange(min, max, input, dstart))
                return null;
        } catch (NumberFormatException nfe) { }
        return "";
    }
}
