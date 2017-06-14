/**
 * 
 * Copyright (c) 2006-2017, Speedment, Inc. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at: 
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.common.tuple.internal.nullable;

import com.speedment.common.tuple.Tuple1;
import com.speedment.common.tuple.TupleOfNullables;
import com.speedment.common.tuple.internal.AbstractTupleOfNullables;
import com.speedment.common.tuple.nullable.Tuple1OfNullables;
import java.util.Optional;

/**
 * An implementation class of a {@link Tuple1OfNullables }
 * 
 * @param <T0> type of element 0
 * 
 * @author Per Minborg
 */
public final class Tuple1OfNullablesImpl<T0> 
extends AbstractTupleOfNullables 
implements Tuple1OfNullables<T0> {
    
    /**
     * Constructs a {@link TupleOfNullables } of type {@link Tuple1OfNullables
     * }.
     * 
     * @param e0 element 0
     */
    public Tuple1OfNullablesImpl(T0 e0) {
        super(Tuple1OfNullablesImpl.class, e0);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public Optional<T0> get0() {
        return Optional.ofNullable((T0) values[0]);
    }
}