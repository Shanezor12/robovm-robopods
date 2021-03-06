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
package org.robovm.pods.charts;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC6Charts31YAxisRendererHorizontalBarChart")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/YAxisRendererHorizontalBarChart/*</name>*/ 
    extends /*<extends>*/ChartYAxisRenderer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class YAxisRendererHorizontalBarChartPtr extends Ptr<YAxisRendererHorizontalBarChart, YAxisRendererHorizontalBarChartPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(YAxisRendererHorizontalBarChart.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected YAxisRendererHorizontalBarChart() {}
    protected YAxisRendererHorizontalBarChart(Handle h, long handle) { super(h, handle); }
    protected YAxisRendererHorizontalBarChart(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithViewPortHandler:yAxis:transformer:")
    public YAxisRendererHorizontalBarChart(ChartViewPortHandler viewPortHandler, ChartYAxis yAxis, ChartTransformer transformer) { super((SkipInit) null); initObject(init(viewPortHandler, yAxis, transformer)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "gridClippingRect")
    public native @ByVal CGRect getGridClippingRect();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithViewPortHandler:yAxis:transformer:")
    protected native @Pointer long init(ChartViewPortHandler viewPortHandler, ChartYAxis yAxis, ChartTransformer transformer);
    @Method(selector = "computeAxisWithMin:max:inverted:")
    public native void computeAxis(double min, double max, boolean inverted);
    @Method(selector = "renderAxisLabelsWithContext:")
    public native void renderAxisLabels(CGContext context);
    @Method(selector = "renderAxisLineWithContext:")
    public native void renderAxisLine(CGContext context);
    @Method(selector = "drawYLabelsWithContext:fixedPosition:positions:offset:")
    public native void drawYLabels(CGContext context, @MachineSizedFloat double fixedPosition, NSArray<NSValue> positions, @MachineSizedFloat double offset);
    @Method(selector = "drawGridLineWithContext:position:")
    public native void drawGridLine(CGContext context, @ByVal CGPoint position);
    @Method(selector = "transformedPositions")
    public native NSArray<NSValue> transformedPositions();
    @Method(selector = "drawZeroLineWithContext:")
    public native void drawZeroLine(CGContext context);
    @Method(selector = "renderLimitLinesWithContext:")
    public native void renderLimitLines(CGContext context);
    /*</methods>*/
}
