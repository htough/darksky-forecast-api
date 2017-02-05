/*
 * The MIT License
 *
 * Copyright 2017 Philipp-André Plogmann.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package pap.darksky.forecast;

import static pap.darksky.forecast.util.Assert.notNull;

/**
 * Represents the Longitude of a GeoCordinate of a physical place on earth.
 *
 * @author Puls
 */
public class Longitude {

    private final Double value;

    /**
     * @param value The Longitude value.
     */
    public Longitude(Double value) {
        notNull("The Longitude value cannot be null.", value);
        if (value < -180 || value > 180) {
            throw new IllegalArgumentException("Longitude must be between -180 and 180. Latitude value invalid: " + value);
        }

        this.value = value;
    }

    /**
     * @return The Longitude value.
     */
    public Double value() {
        return value;
    }
}
