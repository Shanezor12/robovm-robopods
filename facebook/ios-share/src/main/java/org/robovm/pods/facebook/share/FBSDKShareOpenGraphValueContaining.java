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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/FBSDKShareOpenGraphValueContaining/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol, NSSecureCoding/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "allProperties")
    NSDictionary<NSString, ?> getAllProperties();
    @Property(selector = "keyEnumerator")
    NSEnumerator<?> getKeyEnumerator();
    @Property(selector = "objectEnumerator")
    NSEnumerator<?> getObjectEnumerator();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "arrayForKey:")
    NSArray<?> arrayForKey(String key);
    @Method(selector = "enumerateKeysAndObjectsUsingBlock:")
    void enumerateKeysAndObjectsUsingBlock(@Block VoidBlock3<NSString, NSObject, BooleanPtr> block);
    @Method(selector = "numberForKey:")
    NSNumber numberForKey(String key);
    @Method(selector = "stringForKey:")
    String stringForKey(String key);
    @Method(selector = "URLForKey:")
    NSURL URLForKey(String key);
    @Method(selector = "objectForKey:")
    FBSDKShareOpenGraphObject objectForKey(String key);
    @Method(selector = "objectForKeyedSubscript:")
    NSObject objectForKeyedSubscript(String key);
    @Method(selector = "parseProperties:")
    void parseProperties(NSDictionary<NSString, ?> properties);
    @Method(selector = "photoForKey:")
    FBSDKSharePhoto photoForKey(String key);
    @Method(selector = "removeObjectForKey:")
    void removeObjectForKey(String key);
    @Method(selector = "setArray:forKey:")
    void setArray(NSArray<?> array, String key);
    @Method(selector = "setNumber:forKey:")
    void setNumber(NSNumber number, String key);
    @Method(selector = "setObject:forKey:")
    void setObject(FBSDKShareOpenGraphObject object, String key);
    @Method(selector = "setPhoto:forKey:")
    void setPhoto(FBSDKSharePhoto photo, String key);
    @Method(selector = "setString:forKey:")
    void setString(String string, String key);
    @Method(selector = "setURL:forKey:")
    void setURL(NSURL URL, String key);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
