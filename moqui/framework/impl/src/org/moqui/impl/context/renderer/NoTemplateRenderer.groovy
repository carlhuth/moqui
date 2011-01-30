/*
 * This Work is in the public domain and is provided on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied,
 * including, without limitation, any warranties or conditions of TITLE,
 * NON-INFRINGEMENT, MERCHANTABILITY, or FITNESS FOR A PARTICULAR PURPOSE.
 * You are solely responsible for determining the appropriateness of using
 * this Work and assume any risks associated with your use of this Work.
 *
 * This Work includes contributions authored by David E. Jones, not as a
 * "work for hire", who hereby disclaims any copyright to the same.
 */
package org.moqui.impl.context.renderer

import org.eclipse.mylyn.wikitext.confluence.core.ConfluenceLanguage
import org.eclipse.mylyn.wikitext.core.parser.MarkupParser
import org.eclipse.mylyn.wikitext.core.parser.builder.HtmlDocumentBuilder
import org.moqui.context.Cache
import org.moqui.impl.context.ResourceFacadeImpl
import org.moqui.impl.context.TemplateRenderer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class NoTemplateRenderer implements TemplateRenderer {
    protected ResourceFacadeImpl rfi

    NoTemplateRenderer() { }

    TemplateRenderer init(ResourceFacadeImpl rfi) {
        this.rfi = rfi
        return this
    }

    void render(String location, Writer writer) {
        String text = rfi.getLocationText(location, true)
        if (text) writer.write(text)
    }

    void destroy() { }
}
