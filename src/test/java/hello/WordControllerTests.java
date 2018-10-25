/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package hello;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public WordControllerTest
{
    private WordController wordController
    private String input;

    @Before
    public void setUp() throws Exception 
    {
        input = null;
        wordController= new WordController ();
    }

    @After
    public void tearDown() throws Exception 
    {

    }

    @Test(expected = NullPointerException.class)
    public void nullStringTest() throws Exception 
    {
        assertTrue(wordController.isStringNull(null));

    }

    @Test
    public void emptyStringTest() throws Exception 
    {
        input = "";
        assertTrue(wordController.isStringEmpty(input));

    }

    @Test
    public void checkSingleCharTest() throws Exception 
    {
        input = "H";
        assertTrue(wordController.isSingleCharTest(input));
    }

    @Test
    public void validPalindromeTest() throws Exception 
    {
        input = "abc";
        assertTrue(wordController.CheckStringPalindromeOrNot(input));
    }

    @Test
    public void validAnagramOfPalindromeTest() throws Exception
    {
        input = "aab";
        assertTrue(wordController.canFormPalindrome(input));
    }

    @Test
    public void invalidPalindromeTest() throws Exception 
    {
        input = "testing false case for palindrome";
        assertFalse(wordController.CheckStringPalindromeOrNot(input));
    }
}
