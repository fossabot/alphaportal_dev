/**************************************************************************
 * alpha-Portal: A web portal, for managing knowledge-driven 
 * ad-hoc processes, in form of case files.
 * ==============================================
 * Copyright (C) 2011-2012 by 
 *   - Christoph P. Neumann (http://www.chr15t0ph.de)
 *   - and the SWAT 2011 team
 **************************************************************************
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 **************************************************************************
 * $Id$
 *************************************************************************/
package alpha.portal.model;

import org.junit.Assert;
import org.junit.Test;

/**
 * The Class AdornmentTypeDataProvisionTest.
 */
public class AdornmentTypeDataProvisionTest {

	/**
	 * Test from value exception.
	 */
	@Test
	public void testFromValueException() {
		Assert.assertNull(AdornmentTypeDataProvision
				.fromValue("nosuchvalue_$%&/()"));
	}

	/**
	 * Test from value.
	 */
	@Test
	public void testFromValue() {
		Assert.assertTrue(AdornmentTypeDataProvision
				.fromValue(AdornmentTypeDataProvision.OPEN.value()) != null);
		Assert.assertTrue(AdornmentTypeDataProvision
				.fromValue(AdornmentTypeDataProvision.INPROGRESS.value()) != null);
		Assert.assertTrue(AdornmentTypeDataProvision
				.fromValue(AdornmentTypeDataProvision.FULLFILLED.value()) != null);
	}

}
