/*
 * #%L
 * Locator Demo Server
 * %%
 * Copyright (C) 2011 - 2012 Talend Inc.
 * %%
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
 * #L%
 */

package demo.service;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Server {

	public static void main(String args[]) throws Exception {
		new ClassPathXmlApplicationContext(new String[] {"/META-INF/spring/beans.xml"});
		
		Thread.sleep(30 * 60 * 1000);

		System.out.println("Server exiting");
		System.exit(0);
	}
}
