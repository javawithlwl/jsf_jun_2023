package com.careerit.junit5.basics;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
@Suite
@SelectClasses({NumberOperationsTest.class,StringOperationsTest.class})
public class AllUnitTest {
}
