package es.ulpgc;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class IntegerToString_ {
    @Test
    public void given_0_should_return_zero() {
        assertThat(IntegerToString.of(0)).isEqualTo("zero");
    }
    @Test
    public void given_1_should_return_one() {
        assertThat(IntegerToString.of(1)).isEqualTo("one");
    }
    @Test
    public void given_2_should_return_two() {
        assertThat(IntegerToString.of(2)).isEqualTo("two");
    }
    @Test
    public void given_3_should_return_three() {
        assertThat(IntegerToString.of(3)).isEqualTo("three");
    }
    @Test
    public void given_4_should_return_four() {
        assertThat(IntegerToString.of(4)).isEqualTo("four");
    }
    @Test
    public void given_5_should_return_five(){
        assertThat(IntegerToString.of(5)).isEqualTo("five");
    }
    @Test
    public void given_6_should_return_six(){
        assertThat(IntegerToString.of(6)).isEqualTo("six");
    }
    @Test
    public void given_7_should_return_seven(){
        assertThat(IntegerToString.of(7)).isEqualTo("seven");
    }
    @Test
    public void given_8_should_return_eight(){
        assertThat(IntegerToString.of(8)).isEqualTo("eight");
    }
    @Test
    public void given_9_should_return_nine() {
        assertThat(IntegerToString.of(9)).isEqualTo("nine");
    }
    @Test
    public void given_10_should_return_ten(){
        assertThat(IntegerToString.of(10)).isEqualTo("ten");
    }
    @Test
    public void given_11_should_return_eleven(){
        assertThat(IntegerToString.of(11)).isEqualTo("eleven");
    }
    @Test
    public void given_12_should_return_twelve(){
        assertThat(IntegerToString.of(12)).isEqualTo("twelve");
    }
    @Test
    public void given_13_should_return_thirteen(){
        assertThat(IntegerToString.of(13)).isEqualTo("thirteen");
    }
    @Test
    public void given_14_should_return_fourteen(){
        assertThat(IntegerToString.of(14)).isEqualTo("fourteen");
    }
    @Test
    public void given_15_should_return_fifteen(){
        assertThat(IntegerToString.of(15)).isEqualTo("fifteen");
    }
    @Test
    public void given_16_should_return_sixteen(){
        assertThat(IntegerToString.of(16)).isEqualTo("sixteen");
    }
    @Test
    public void given_17_should_return_seventeen(){
        assertThat(IntegerToString.of(17)).isEqualTo("seventeen");
    }
    @Test
    public void given_18_should_return_eighteen(){
        assertThat(IntegerToString.of(18)).isEqualTo("eighteen");
    }
    @Test
    public void given_19_should_return_nineteen(){
        assertThat(IntegerToString.of(19)).isEqualTo("nineteen");
    }
    @Test
    public void given_20_should_return_twenty(){
        assertThat(IntegerToString.of(20)).isEqualTo("twenty");
    }
    @Test
    public void given_21_should_return_twentyone(){
        assertThat(IntegerToString.of(21)).isEqualTo("twenty-one");
    }
    @Test
    public void given_30_should_return_thirty(){
        assertThat(IntegerToString.of(30)).isEqualTo("thirty");
    }
    @Test
    public void given_31_should_return_thirtyone(){
        assertThat(IntegerToString.of(31)).isEqualTo("thirty-one");
    }
    @Test
    public void given_40_should_return_forty(){
        assertThat(IntegerToString.of(40)).isEqualTo("forty");
    }
    @Test
    public void given_41_should_return_fortyone(){
        assertThat(IntegerToString.of(41)).isEqualTo("forty-one");
    }
    @Test
    public void given_50_should_return_fifty(){
        assertThat(IntegerToString.of(50)).isEqualTo("fifty");
    }
    @Test
    public void given_51_should_return_fiftyone(){
        assertThat(IntegerToString.of(51)).isEqualTo("fifty-one");
    }
    @Test
    public void given_61_should_return_sixtyone(){
        assertThat(IntegerToString.of(61)).isEqualTo("sixty-one");
    }
    @Test
    public void given_71_should_return_seventyone(){
        assertThat(IntegerToString.of(71)).isEqualTo("seventy-one");
    }
    @Test
    public void given_81_should_return_eightyone(){
        assertThat(IntegerToString.of(81)).isEqualTo("eighty-one");
    }
    @Test
    public void given_91_should_return_ninetyone() {
        assertThat(IntegerToString.of(91)).isEqualTo("ninety-one");
    }
    @Test
    public void given_100_should_return_one_hundred(){
        assertThat(IntegerToString.of(100)).isEqualTo("one hundred");
    }
    @Test
    public void given_101_should_return_one_hundred_one() {
        assertThat(IntegerToString.of(101)).isEqualTo("one hundred one");
    }
    @Test
    public void given_150_should_return_one_hundred_fifty() {
        assertThat(IntegerToString.of(150)).isEqualTo("one hundred fifty");
    }
    @Test
    public void given_328_should_return_three_hundred_twentyeight() {
        assertThat(IntegerToString.of(328)).isEqualTo("three hundred twenty-eight");
    }
    @Test
    public void given_409_should_return_four_hundred_nine() {
        assertThat(IntegerToString.of(409)).isEqualTo("four hundred nine");
    }
    @Test
    public void given_999_should_return_nine_hundred_ninetynine() {
        assertThat(IntegerToString.of(999)).isEqualTo("nine hundred ninety-nine");
    }
    @Test
    public void given_1000_should_return_one_thousand() {
        assertThat(IntegerToString.of(1000)).isEqualTo("one thousand");
    }
    @Test
    public void given_1001_should_return_one_thousand_one() {
        assertThat(IntegerToString.of(1001)).isEqualTo("one thousand one");
    }
    @Test
    public void given_1509_should_return_one_thousand_five_hundred_nine() {
        assertThat(IntegerToString.of(1509)).isEqualTo("one thousand five hundred nine");
    }
    @Test
    public void given_5009_should_return_five_thousand_nine() {
        assertThat(IntegerToString.of(5009)).isEqualTo("five thousand nine");
    }
    @Test
    public void given_9999_should_return_nine_thousand_nine_hundred_ninetynine() {
        assertThat(IntegerToString.of(9999)).isEqualTo("nine thousand nine hundred ninety-nine");
    }
    @Test
    public void given_10000_should_return_ten_thousand() {
        assertThat(IntegerToString.of(10000)).isEqualTo("ten thousand");
    }
    @Test
    public void given_10100_should_return_ten_thousand_one_hundred() {
        assertThat(IntegerToString.of(10100)).isEqualTo("ten thousand one hundred");
    }
    @Test
    public void given_11111_should_return_eleven_thousand_one_hundred_eleven() {
        assertThat(IntegerToString.of(11111)).isEqualTo("eleven thousand one hundred eleven");
    }
    @Test
    public void given_100001_should_return_one_hundred_one_thousand_one() {
        assertThat(IntegerToString.of(100001)).isEqualTo("one hundred thousand one");
    }
    @Test
    public void given_56897_should_return_fiftysix_thousand_eight_hundred_ninetyseven() {
        assertThat(IntegerToString.of(56897)).isEqualTo("fifty-six thousand eight hundred ninety-seven");
    }
    @Test
    public void given_999999_should_return_nine_hundred_ninetynine_thousand_nine_hundred_ninetynine() {
        assertThat(IntegerToString.of(999999)).isEqualTo("nine hundred ninety-nine thousand nine hundred ninety-nine");
    }
    @Test
    public void given_303030_should_return_three_hundred_three_thousand_thirty() {
        assertThat(IntegerToString.of(303030)).isEqualTo("three hundred three thousand thirty");
    }
    @Test
    public void given_1000000_should_return_one_million() {
        assertThat(IntegerToString.of(1000000)).isEqualTo("one million");
    }
    @Test
    public void given_111111111_should_return_one_hundred_eleven_million_one_hundred_eleven_thousand_one_hundred_eleven() {
        assertThat(IntegerToString.of(111111111)).isEqualTo("one hundred eleven million one hundred eleven thousand one hundred eleven");
    }
    @Test
    public void given_5192352_should_return_five_million_one_hundred_ninetytwo_thousand_three_hundred_fifty_two() {
        assertThat(IntegerToString.of(5192352)).isEqualTo("five million one hundred ninety-two thousand three hundred fifty-two");
    }
    @Test
    public void given_6000001_should_return_six_million_one() {
        assertThat(IntegerToString.of(6000001)).isEqualTo("six million one");
    }
}
