/*
 * Copyright 2011 Herve Quiroz
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 2 of the License, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 59 Temple
 * Place, Suite 330, Boston, MA 02111-1307 USA
 */
package org.trancecode.xproc.calabash;

import com.xmlcalabash.core.XProcConfiguration;
import com.xmlcalabash.core.XProcConstants;
import com.xmlcalabash.core.XProcRuntime;

import javax.xml.transform.Source;

import org.trancecode.xproc.api.Pipeline;
import org.trancecode.xproc.api.PipelineFactory;

/**
 * @author Herve Quiroz
 */
public final class CalabashPipelineFactory extends PipelineFactory
{
    @Override
    public Pipeline newPipeline(final Source pipelineSource)
    {
        final XProcConfiguration configuration = new XProcConfiguration();
        final XProcRuntime runtime = new XProcRuntime(configuration);

        // TODO CalabashPipelineFactory.newPipeline()
        throw new UnsupportedOperationException();
    }

    @Override
    public String getVersion()
    {
        return XProcConstants.XPROC_VERSION;
    }

    @Override
    public String getXProcVersion()
    {
        return "1.0";
    }

    @Override
    public String getXPathVersion()
    {
        return "2.0";
    }

    @Override
    public String getProductName()
    {
        return "XML Calabash";
    }

    @Override
    public String getVendor()
    {
        return "Norman Walsh";
    }

    @Override
    public String getVendorUri()
    {
        return "http://xmlcalabash.com/";
    }
}
