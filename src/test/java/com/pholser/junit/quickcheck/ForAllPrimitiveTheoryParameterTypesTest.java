/*
 The MIT License

 Copyright (c) 2010-2012 Paul R. Holser, Jr.

 Permission is hereby granted, free of charge, to any person obtaining
 a copy of this software and associated documentation files (the
 "Software"), to deal in the Software without restriction, including
 without limitation the rights to use, copy, modify, merge, publish,
 distribute, sublicense, and/or sell copies of the Software, and to
 permit persons to whom the Software is furnished to do so, subject to
 the following conditions:

 The above copyright notice and this permission notice shall be
 included in all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/

package com.pholser.junit.quickcheck;

import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.generator.ShortGenerator;
import org.junit.Test;
import org.junit.contrib.theories.Theories;
import org.junit.contrib.theories.Theory;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.number.OrderingComparison.*;
import static org.junit.Assert.*;
import static org.junit.experimental.results.PrintableResult.*;
import static org.junit.experimental.results.ResultMatchers.*;

public class ForAllPrimitiveTheoryParameterTypesTest {
    @Test
    public void primitiveBoolean() {
        assertThat(testResult(PrimitiveBoolean.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class PrimitiveBoolean {
        @Theory
        public void shouldHold(@ForAll boolean b) {
        }
    }

    @Test
    public void wrapperBoolean() {
        assertThat(testResult(WrapperBoolean.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class WrapperBoolean {
        @Theory
        public void shouldHold(@ForAll Boolean b) {
        }
    }

    @Test
    public void primitiveByte() {
        assertThat(testResult(PrimitiveByte.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class PrimitiveByte {
        @Theory
        public void shouldHold(@ForAll byte b) {
        }
    }

    @Test
    public void rangedPrimitiveByte() {
        assertThat(testResult(RangedPrimitiveByte.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class RangedPrimitiveByte {
        @Theory
        public void shouldHold(@ForAll @InRange(min = "-23", max = "34") byte b) {
            assertThat(b, allOf(greaterThanOrEqualTo((byte) -23), lessThanOrEqualTo((byte) 34)));
        }
    }

    @Test
    public void wrapperByte() {
        assertThat(testResult(WrapperByte.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class WrapperByte {
        @Theory
        public void shouldHold(@ForAll Byte b) {
        }
    }

    @Test
    public void rangedWrapperByte() {
        assertThat(testResult(RangedWrapperByte.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class RangedWrapperByte {
        @Theory
        public void shouldHold(@ForAll @InRange(min = "-3", max = "2") Byte b) {
            assertThat(b, allOf(greaterThanOrEqualTo((byte) -3), lessThanOrEqualTo((byte) 2)));
        }
    }

    @Test
    public void primitiveCharacter() {
        assertThat(testResult(PrimitiveCharacter.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class PrimitiveCharacter {
        @Theory
        public void shouldHold(@ForAll char ch) {
        }
    }

    @Test
    public void wrapperCharacter() {
        assertThat(testResult(WrapperCharacter.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class WrapperCharacter {
        @Theory
        public void shouldHold(@ForAll Character ch) {
        }
    }

    @Test
    public void primitiveDouble() {
        assertThat(testResult(PrimitiveDouble.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class PrimitiveDouble {
        @Theory
        public void shouldHold(@ForAll double d) {
        }
    }

    @Test
    public void wrapperDouble() {
        assertThat(testResult(WrapperDouble.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class WrapperDouble {
        @Theory
        public void shouldHold(@ForAll Double d) {
        }
    }

    @Test
    public void primitiveFloat() {
        assertThat(testResult(PrimitiveFloat.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class PrimitiveFloat {
        @Theory
        public void shouldHold(@ForAll float f) {
        }
    }

    @Test
    public void wrapperFloat() {
        assertThat(testResult(WrapperFloat.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class WrapperFloat {
        @Theory
        public void shouldHold(@ForAll Float f) {
        }
    }

    @Test
    public void primitiveInteger() {
        assertThat(testResult(PrimitiveInteger.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class PrimitiveInteger {
        @Theory
        public void shouldHold(@ForAll int i) {
        }
    }

    @Test
    public void rangedPrimitiveInteger() {
        assertThat(testResult(RangedPrimitiveInteger.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class RangedPrimitiveInteger {
        @Theory
        public void shouldHold(@ForAll @InRange(min = "2", max = "10") int i) {
            assertThat(i, allOf(greaterThanOrEqualTo(2), lessThanOrEqualTo(10)));
        }
    }

    @Test
    public void wrapperInteger() {
        assertThat(testResult(WrapperInteger.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class WrapperInteger {
        @Theory
        public void shouldHold(@ForAll Integer i) {
        }
    }

    @Test
    public void rangedWrapperInteger() {
        assertThat(testResult(RangedWrapperInteger.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class RangedWrapperInteger {
        @Theory
        public void shouldHold(@ForAll @InRange(min = "-4", max = "3") Integer i) {
            assertThat(i, allOf(greaterThanOrEqualTo(-4), lessThanOrEqualTo(3)));
        }
    }

    @Test
    public void primitiveLong() {
        assertThat(testResult(PrimitiveLong.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class PrimitiveLong {
        @Theory
        public void shouldHold(@ForAll long ell) {
        }
    }

    @Test
    public void wrapperLong() {
        assertThat(testResult(WrapperLong.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class WrapperLong {
        @Theory
        public void shouldHold(@ForAll Long ell) {
        }
    }

    @Test
    public void primitiveShort() {
        assertThat(testResult(PrimitiveShort.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class PrimitiveShort {
        @Theory
        public void shouldHold(@ForAll short s) {
        }
    }

    @Test
    public void rangedPrimitiveShort() {
        assertThat(testResult(RangedPrimitiveShort.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class RangedPrimitiveShort {
        @Theory
        public void shouldHold(@ForAll @InRange(min = "35", max = "67") short s) {
            assertThat(s, allOf(greaterThanOrEqualTo((short) 35), lessThanOrEqualTo((short) 67)));
        }
    }

    @Test
    public void wrapperShort() {
        assertThat(testResult(WrapperShort.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class WrapperShort {
        @Theory
        public void shouldHold(@ForAll Short s) {
        }
    }

    @Test
    public void rangedWrapperShort() {
        assertThat(testResult(RangedWrapperShort.class), isSuccessful());
    }

    @RunWith(Theories.class)
    public static class RangedWrapperShort {
        @Theory
        public void shouldHold(@ForAll @InRange(min = "-10", max = "0") Short s) {
            assertThat(s, allOf(greaterThanOrEqualTo((short) -10), lessThanOrEqualTo((short) 0)));
        }
    }
}
