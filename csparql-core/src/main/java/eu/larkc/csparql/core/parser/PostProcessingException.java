/*******************************************************************************
 * Copyright 2013 Davide Barbieri, Emanuele Della Valle, Marco Balduini
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Acknowledgements:
 * 
 * This work was partially supported by the European project LarKC (FP7-215535)
 ******************************************************************************/
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eu.larkc.csparql.core.parser;

/**
 * Exception thrown when a method <code>treeCheck</code> of a class which implements
 * <code>TreeCheckerInterface</code> fails.
 * 
 * @author Marco
 */
public class PostProcessingException extends Exception {

   /**
    * Creates a new instance of <code>PostProcessingException</code> without detail message.
    */
   public PostProcessingException() {
   }

   /**
    * Constructs an instance of <code>PostProcessingException</code> with the specified
    * detail message.
    * 
    * @param msg
    *           the detail message.
    */
   public PostProcessingException(final String msg) {
      super(msg);
   }
}
