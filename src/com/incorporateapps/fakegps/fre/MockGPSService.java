package com.incorporateapps.fakegps.fre;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.preference.PreferenceManager;
import android.support.v4.app.NotificationCompat.Builder;
import android.widget.RemoteViews;
import android.widget.Toast;
import java.text.DecimalFormat;

public class MockGPSService
  extends Service
{
  protected static int a = 66;
  public static float b = 1.0F;
  public static float c = 10.0F;
  private static final String l = MockGPSService.class.getSimpleName();
  SharedPreferences d;
  at e;
  NotificationManager f;
  Context g;
  int h = 10111;
  NotificationManager i;
  double j;
  double k;
  
  private void a()
  {
    g = getApplicationContext();
    d = PreferenceManager.getDefaultSharedPreferences(g);
    j = d.getFloat("CurrentLat", 0.0F);
    k = d.getFloat("CurrentLon", 0.0F);
    e.a(j, k);
    getString(2131230776);
    BitmapFactory.decodeResource(g.getResources(), 2130837681);
    Object localObject1 = new DecimalFormat("0.00000000");
    String str = getString(2131230776);
    localObject1 = "lat:" + ((DecimalFormat)localObject1).format(j) + " lon: " + ((DecimalFormat)localObject1).format(k);
    i = ((NotificationManager)getSystemService("notification"));
    Object localObject2 = new Intent(g, Maps.class);
    ((Intent)localObject2).setFlags(67108864);
    localObject2 = PendingIntent.getActivity(g, 0, (Intent)localObject2, 0);
    localObject2 = new NotificationCompat.Builder(g).setContentText((CharSequence)localObject1).setContentTitle(str).setSmallIcon(2130837683).setAutoCancel(false).setContentIntent((PendingIntent)localObject2).setWhen(System.currentTimeMillis()).setOngoing(true).build();
    RemoteViews localRemoteViews = new RemoteViews(getPackageName(), 2130903066);
    localRemoteViews.setTextViewText(2131361876, str);
    localRemoteViews.setTextViewText(2131361910, (CharSequence)localObject1);
    flags = 34;
    contentView = localRemoteViews;
    localRemoteViews.setOnClickPendingIntent(2131361909, PendingIntent.getBroadcast(this, 0, new Intent("com.incorporateapps.fakegps.fre.ACTION_STOP"), 134217728));
    i.notify(h, (Notification)localObject2);
    Toast.makeText(g, 2131230816, 1).show();
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    e = new at(getApplicationContext());
    f = ((NotificationManager)getSystemService("notification"));
  }
  
  public void onDestroy()
  {
    try
    {
      e.a();
      if (Build.VERSION.SDK_INT >= 11) {
        i.cancel(h);
      }
      for (;;)
      {
        try
        {
          if (g != null) {
            Toast.makeText(g, 2131230817, 1).show();
          }
          return;
        }
        catch (Exception localException2) {}
        stopForeground(true);
      }
    }
    catch (Exception localException1)
    {
      for (;;) {}
    }
  }
  
  public void onStart(Intent paramIntent, int paramInt)
  {
    a();
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    a();
    return 1;
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.MockGPSService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */