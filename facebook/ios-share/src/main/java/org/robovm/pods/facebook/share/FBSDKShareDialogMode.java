/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
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
 */
package org.robovm.pods.facebook.share;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.photos.*;
import org.robovm.pods.facebook.core.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedUIntMarshaler.class) @Library(Library.INTERNAL)/*</annotations>*/
public enum /*<name>*/FBSDKShareDialogMode/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Automatic(0L),
    Native(1L),
    ShareSheet(2L),
    Browser(3L),
    Web(4L),
    FeedBrowser(5L),
    FeedWeb(6L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(FBSDKShareDialogMode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*/
    @Bridge(symbol="NSStringFromFBSDKShareDialogMode", optional=true)
    protected static native @org.robovm.rt.bro.annotation.Marshaler(NSString.AsStringMarshaler.class) String toString(FBSDKShareDialogMode dialogMode);
    /*</methods>*/

    @Override
    public String toString() {
        return toString(this);
    }

    private final long n;

    private /*<name>*/FBSDKShareDialogMode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/FBSDKShareDialogMode/*</name>*/ valueOf(long n) {
        for (/*<name>*/FBSDKShareDialogMode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/FBSDKShareDialogMode/*</name>*/.class.getName());
    }
}
