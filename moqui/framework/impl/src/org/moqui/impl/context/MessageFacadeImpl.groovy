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
package org.moqui.impl.context

import org.moqui.context.MessageFacade
import org.moqui.context.ValidationError

public class MessageFacadeImpl implements MessageFacade {

    protected List<String> messageList = new LinkedList<String>()
    protected List<String> errorList = new LinkedList<String>()
    protected List<ValidationError> validationErrorList = new LinkedList<ValidationError>()

    MessageFacadeImpl() { }

    /** @see org.moqui.context.MessageFacade#getMessages() */
    public List<String> getMessages() { return this.messageList }
    void addMessage(String message) { if (message) this.messageList.add(message) }

    /** @see org.moqui.context.MessageFacade#getErrors() */
    public List<String> getErrors() { return this.errorList }
    void addError(String error) { if (error) this.errorList.add(error) }

    /** @see org.moqui.context.MessageFacade#getValidationErrors() */
    public List<ValidationError> getValidationErrors() { return this.validationErrorList }
}
