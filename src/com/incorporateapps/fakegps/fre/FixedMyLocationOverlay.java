package com.incorporateapps.fakegps.fre;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.preference.PreferenceManager;
import android.widget.Toast;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;
import com.google.android.maps.Projection;

public class FixedMyLocationOverlay
  extends MyLocationOverlay
{
  SharedPreferences a;
  SharedPreferences.Editor b;
  Location c;
  private boolean d = false;
  private Paint e;
  private Point f;
  private Point g;
  private Drawable h;
  private int i;
  private int j;
  private Context k;
  
  public FixedMyLocationOverlay(Context paramContext, MapView paramMapView)
  {
    super(paramContext, paramMapView);
    k = paramContext;
    a = PreferenceManager.getDefaultSharedPreferences(paramContext);
    b = a.edit();
  }
  
  public boolean dispatchTap()
  {
    Location localLocation = getLastFix();
    Object localObject = localLocation;
    if (c != null)
    {
      localObject = localLocation;
      if (c.getAccuracy() < localLocation.getAccuracy()) {
        localObject = c;
      }
    }
    if (localObject != null)
    {
      localObject = Float.valueOf(((Location)localObject).getAccuracy());
      if (localObject != null) {
        Toast.makeText(k, String.format(k.getResources().getString(2131230871), new Object[] { Double.valueOf(MyFunctions.a(((Float)localObject).floatValue())), "meters" }), 0).show();
      }
    }
    return false;
  }
  
  protected void drawMyLocation(Canvas paramCanvas, MapView paramMapView, Location paramLocation, GeoPoint paramGeoPoint, long paramLong)
  {
    if ((c != null) && (c.getAccuracy() < paramLocation.getAccuracy())) {
      paramLocation = c;
    }
    for (;;)
    {
      if (!d) {}
      try
      {
        super.drawMyLocation(paramCanvas, paramMapView, paramLocation, paramGeoPoint, paramLong);
        if (d)
        {
          if (h == null)
          {
            e = new Paint();
            e.setAntiAlias(true);
            e.setStrokeWidth(2.0F);
            h = paramMapView.getContext().getResources().getDrawable(2130837691);
            i = h.getIntrinsicWidth();
            j = h.getIntrinsicHeight();
            f = new Point();
            g = new Point();
          }
          paramMapView = paramMapView.getProjection();
          double d1 = paramLocation.getLatitude();
          double d2 = paramLocation.getLongitude();
          float f1 = paramLocation.getAccuracy();
          paramLocation = new float[1];
          Location.distanceBetween(d1, d2, d1, d2 + 1.0D, paramLocation);
          float f2 = paramLocation[0];
          paramMapView.toPixels(new GeoPoint((int)(d1 * 1000000.0D), (int)((d2 - f1 / f2) * 1000000.0D)), g);
          paramMapView.toPixels(paramGeoPoint, f);
          int m = f.x - g.x;
          e.setColor(-10066177);
          e.setStyle(Paint.Style.STROKE);
          paramCanvas.drawCircle(f.x, f.y, m, e);
          e.setColor(409364223);
          e.setStyle(Paint.Style.FILL);
          paramCanvas.drawCircle(f.x, f.y, m, e);
          h.setBounds(f.x - i / 2, f.y - j / 2, f.x + i / 2, f.y + j / 2);
          h.draw(paramCanvas);
        }
        return;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          d = true;
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.FixedMyLocationOverlay
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */