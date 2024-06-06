package N2Ejercicio1;

import org.hamcrest.CoreMatchers;
import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

public class StringLengthMatcher extends FeatureMatcher<String, Integer> {

    public StringLengthMatcher(Matcher<? super Integer> matcher) {
        super(matcher, "a string with length", "length");
    }

    @Override
    protected Integer featureValueOf(String actual) {
        return actual.length();
    }


    public static Matcher<String> hasLength(int length) {
        return new StringLengthMatcher(CoreMatchers.is(length));
    }
}