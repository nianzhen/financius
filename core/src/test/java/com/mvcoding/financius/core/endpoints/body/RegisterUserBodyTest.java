/*
 * Copyright (C) 2015 Mantas Varnagiris.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

package com.mvcoding.financius.core.endpoints.body;

import org.junit.Before;
import org.junit.Test;

public class RegisterUserBodyTest {
    private RegisterUserBody body;

    @Before public void setUp() {
        body = new RegisterUserBody();
    }

    @Test public void validate_doesNotThrowException_whenAllFieldsAreValid() {
        makeAllFieldsValid(body);

        body.validate();
    }

    @Test(expected = RuntimeException.class) public void validate_throwsRuntimeException_whenGoogleIdIsNull() {
        makeAllFieldsValid(body);
        body.setGoogleId(null);

        body.validate();
    }

    @Test(expected = RuntimeException.class) public void validate_throwsRuntimeException_whenGoogleIdIsEmpty() {
        makeAllFieldsValid(body);
        body.setGoogleId("");

        body.validate();
    }

    private void makeAllFieldsValid(RegisterUserBody body) {
        body.setGoogleId("any");
    }
}
