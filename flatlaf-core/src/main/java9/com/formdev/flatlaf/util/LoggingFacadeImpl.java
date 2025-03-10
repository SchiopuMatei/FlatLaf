/*
 * Copyright 2021 FormDev Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.formdev.flatlaf.util;

import com.formdev.flatlaf.FlatLaf;

class LoggingFacadeImpl
	implements LoggingFacade
{
	private static final System.Logger LOG = System.getLogger( FlatLaf.class.getName() );

	@Override
	public void logSevere( String message, Throwable t ) {
		LOG.log( System.Logger.Level.ERROR, message, t );
	}

	@Override
	public void logConfig( String message, Throwable t ) {
		LOG.log( System.Logger.Level.DEBUG, message, t );
	}
}
