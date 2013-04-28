/*
 * Copyright (c) 2007-2013 Concurrent, Inc. All Rights Reserved.
 *
 * Project and contact information: http://www.cascading.org/
 *
 * This file is part of the Cascading project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cascading.pattern.model.generalregression.predictor;

/**
 *
 */
public class CovariantPredictor extends Predictor
  {
  private final double exponent;

  public CovariantPredictor( String fieldName )
    {
    super( fieldName );

    this.exponent = 1.0d;
    }

  public CovariantPredictor( String fieldName, double exponent )
    {
    super( fieldName );

    this.exponent = exponent;
    }

  public double calculate( double value )
    {
    return Math.pow( value, exponent );
    }
  }