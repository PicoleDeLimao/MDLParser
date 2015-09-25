package io.github.picoledelimao.mdl.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ MDLBooleanTest.class, MDLNumberArrayTest.class, MDLNumberTest.class, MDLStringTest.class,
		MDLVersionTest.class, MDLAnimTest.class, MDLSequencesTest.class, MDLGlobalSequencesTest.class, 
		MDLBitmapTest.class, MDLTexturesTest.class, MDLEnumTest.class, MDLBooleanArrayTest.class,
		MDLAnimationKeyFrame.class})
public class AllTests {

}
