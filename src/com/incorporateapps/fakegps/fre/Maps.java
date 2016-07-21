package com.incorporateapps.fakegps.fre;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.AppOpsManager;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Process;
import android.provider.ContactsContract.Data;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;
import java.util.List;

public class Maps
  extends MapActivity
{
  private static String A = "Maps";
  private DB B;
  private MapController C;
  private MapView D;
  private GeoPoint E;
  private Overlay F;
  private ProgressDialog G = null;
  private ProgressDialog H = null;
  private ProgressDialog I = null;
  private ProgressDialog J = null;
  private List K = null;
  private int L = 0;
  private Location M;
  private InterstitialAd N;
  private boolean O = false;
  private boolean P = false;
  private boolean Q = false;
  private GeoPoint R = null;
  private Handler S = new l(this);
  private Handler T = new w(this);
  private volatile int U = 0;
  private Handler V = new ah(this);
  private boolean W = false;
  private boolean X = false;
  private boolean Y = false;
  private boolean Z = false;
  ImageView a;
  private boolean aa = false;
  private boolean ab = false;
  private FixedMyLocationOverlay ac = null;
  private Handler ad = new an(this);
  private Handler ae = new ap(this);
  ImageView b;
  boolean c = false;
  long d;
  long e = -1L;
  MyItemizedOverlay f;
  String g = "";
  String h = "";
  String i = "";
  String j = "";
  Drawable k;
  Context l;
  CharSequence[] m;
  AlertDialog n;
  SharedPreferences o;
  SharedPreferences.Editor p;
  Intent q;
  String r = "217953415";
  String s = "228596641";
  String t = "398701144";
  String u = "669202757";
  GoogleAnalytics v;
  boolean w = false;
  boolean x = false;
  int y = 0;
  int z;
  
  private static Location b(String paramString)
  {
    String[] arrayOfString = paramString.split(",");
    if ((arrayOfString.length < 2) || (arrayOfString.length > 3)) {
      paramString = null;
    }
    for (;;)
    {
      return paramString;
      try
      {
        Location localLocation = new Location("GeoUri");
        localLocation.setLatitude(Double.valueOf(arrayOfString[0]).doubleValue());
        localLocation.setLongitude(Double.valueOf(arrayOfString[1]).doubleValue());
        paramString = localLocation;
        if (arrayOfString.length == 3)
        {
          localLocation.setAltitude(Double.valueOf(arrayOfString[2]).doubleValue());
          return localLocation;
        }
      }
      catch (Exception paramString) {}
    }
    return null;
  }
  
  private boolean e()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((MyFunctions.b(l)) || (Build.VERSION.SDK_INT >= 23)) {}
    for (;;)
    {
      try
      {
        i1 = ((AppOpsManager)getSystemService("appops")).checkOp("android:mock_location", Process.myUid(), getPackageName());
        if (i1 != 0) {
          continue;
        }
        i1 = 1;
      }
      catch (Exception localException)
      {
        i1 = 0;
        continue;
      }
      bool1 = bool2;
      if (i1 != 0)
      {
        new AlertDialog.Builder(l).setIcon(2130837681).setTitle(2131230834).setMessage(2131230835).setPositiveButton(2131230846, new p(this)).setNegativeButton(2131230854, new q(this)).create().show();
        bool1 = true;
      }
      return bool1;
      int i1 = 0;
      continue;
      try
      {
        i1 = Settings.Secure.getInt(getContentResolver(), "mock_location");
        if (i1 <= 0) {
          i1 = 0;
        }
      }
      catch (Settings.SettingNotFoundException localSettingNotFoundException)
      {
        localSettingNotFoundException.printStackTrace();
        i1 = 0;
      }
    }
  }
  
  private void f()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle(2131230820);
    localBuilder.setMessage(2131230821).setCancelable(true).setNegativeButton(2131230846, new m(this)).setPositiveButton(2131230819, new n(this));
    localBuilder.create().show();
  }
  
  private void g()
  {
    TextView localTextView = (TextView)LayoutInflater.from(this).inflate(2130903067, null).findViewById(2131361911);
    localTextView.setText(2131230830);
    localTextView.setMovementMethod(LinkMovementMethod.getInstance());
    new AlertDialog.Builder(l).setIcon(2130837681).setTitle(2131230831).setMessage(2131230830).setPositiveButton(2131230875, new s(this)).setNegativeButton(2131230853, new t(this)).create().show();
  }
  
  private void h()
  {
    GeoPoint localGeoPoint = null;
    if (f != null) {
      localGeoPoint = f.b();
    }
    if (localGeoPoint != null) {}
    try
    {
      stopService(q);
      startService(q);
      finish();
      return;
      Toast.makeText(l, 2131230818, 1).show();
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  private void i()
  {
    new AlertDialog.Builder(l).setIcon(2130837681).setTitle(2131230822).setMessage(2131230823).setPositiveButton(2131230875, new am(this)).create().show();
  }
  
  public final int a()
  {
    return U;
  }
  
  final void a(GeoPoint paramGeoPoint)
  {
    try
    {
      Object localObject = getResources().getDrawable(2130837692);
      b();
      List localList = D.getOverlays();
      f = new MyItemizedOverlay((Drawable)localObject, D, this);
      h = getString(2131230807);
      localObject = new OverlayItem(paramGeoPoint, g, h);
      f.b((OverlayItem)localObject);
      f.a(paramGeoPoint);
      f.a((OverlayItem)localObject);
      f.d();
      f.b(i);
      f.a(j);
      b(paramGeoPoint);
      localList.add(f);
      double d1 = paramGeoPoint.getLatitudeE6() / 1000000.0D;
      double d2 = paramGeoPoint.getLongitudeE6() / 1000000.0D;
      p.putFloat("CurrentLat", (float)d1);
      p.putFloat("CurrentLon", (float)d2);
      p.commit();
      return;
    }
    catch (Exception paramGeoPoint)
    {
      Log.e("Exception push pin on map", paramGeoPoint.toString());
    }
  }
  
  public final void a(GeoPoint paramGeoPoint, String paramString1, String paramString2, MyItemizedOverlay paramMyItemizedOverlay)
  {
    paramString1 = new OverlayItem(paramGeoPoint, paramString1, paramString2);
    if (f == null) {
      f = paramMyItemizedOverlay;
    }
    f.b(paramString1);
    f.a(paramString1);
    f.a(paramGeoPoint);
    f.d();
  }
  
  protected final void a(String paramString)
  {
    G = ProgressDialog.show(this, getString(2131230801), getString(2131230802), true, false);
    new u(this, paramString).start();
  }
  
  public final void b()
  {
    try
    {
      if (f != null) {
        f.c(f.a());
      }
      return;
    }
    catch (Exception localException)
    {
      Log.e("Delete Marker Exception", localException.toString());
    }
  }
  
  public final void b(GeoPoint paramGeoPoint)
  {
    try
    {
      new x(this, paramGeoPoint).start();
      return;
    }
    finally
    {
      paramGeoPoint = finally;
      throw paramGeoPoint;
    }
  }
  
  protected final void c()
  {
    String str = getPackageName().replace(".fre", "");
    startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)));
  }
  
  public final void d()
  {
    for (;;)
    {
      try
      {
        i1 = Build.VERSION.SDK_INT;
        if (i1 < 23) {}
      }
      catch (Settings.SettingNotFoundException localSettingNotFoundException)
      {
        g();
        return;
      }
      try
      {
        i1 = ((AppOpsManager)getSystemService("appops")).checkOp("android:mock_location", Process.myUid(), getPackageName());
        if (i1 != 0) {
          break label83;
        }
        i1 = 1;
      }
      catch (Exception localException)
      {
        i1 = 0;
        continue;
      }
      if (i1 == 0)
      {
        g();
        return;
      }
      h();
      return;
      if (Settings.Secure.getInt(getContentResolver(), "mock_location") <= 0)
      {
        g();
        return;
      }
      h();
      return;
      label83:
      i1 = 0;
    }
  }
  
  protected boolean isRouteDisplayed()
  {
    return false;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt2)
    {
    }
    do
    {
      return;
      switch (paramInt1)
      {
      default: 
        return;
      }
    } while (paramIntent == null);
    for (;;)
    {
      try
      {
        localObject = managedQuery(paramIntent.getData(), null, null, null, null);
        paramIntent = getContentResolver();
        startManagingCursor((Cursor)localObject);
        if ((((Cursor)localObject).getColumnCount() > 0) && (((Cursor)localObject).moveToFirst()))
        {
          localObject = ((Cursor)localObject).getString(((Cursor)localObject).getColumnIndexOrThrow("_id"));
          localCursor = paramIntent.query(ContactsContract.Data.CONTENT_URI, null, "contact_id = ? AND mimetype = ?", new String[] { localObject, "vnd.android.cursor.item/postal-address_v2" }, null);
          startManagingCursor(localCursor);
          m = new String[localCursor.getCount()];
          paramInt1 = 0;
          if (localCursor.moveToNext()) {
            continue;
          }
          localCursor.close();
        }
      }
      catch (Exception paramIntent)
      {
        Object localObject;
        Cursor localCursor;
        String str5;
        String str3;
        String str2;
        String str4;
        String str1;
        Toast.makeText(l, 2131230804, 0).show();
        continue;
        if (m.length <= 0) {
          continue;
        }
        a((String)m[0]);
        return;
        Toast.makeText(l, 2131230804, 0).show();
        return;
      }
      try
      {
        if (m == null) {
          break label747;
        }
        if (m.length <= 1) {
          continue;
        }
        paramIntent = new AlertDialog.Builder(this);
        paramIntent.setTitle(2131230805);
        paramIntent.setItems(m, new ag(this));
        paramIntent.create().show();
        return;
      }
      catch (Exception paramIntent)
      {
        Toast.makeText(l, 2131230804, 0).show();
        return;
      }
      localObject = "";
      localCursor.getString(localCursor.getColumnIndex("data5"));
      localCursor.getString(localCursor.getColumnIndex("data6"));
      str5 = localCursor.getString(localCursor.getColumnIndex("data4"));
      str3 = localCursor.getString(localCursor.getColumnIndex("data7"));
      str2 = localCursor.getString(localCursor.getColumnIndex("data8"));
      str4 = localCursor.getString(localCursor.getColumnIndex("data9"));
      str1 = localCursor.getString(localCursor.getColumnIndex("data10"));
      localCursor.getString(localCursor.getColumnIndex("data2"));
      paramIntent = (Intent)localObject;
      if (str5 != null)
      {
        paramIntent = (Intent)localObject;
        if (!str5.equals("")) {
          paramIntent = "" + str5 + ",";
        }
      }
      localObject = paramIntent;
      if (str4 != null)
      {
        localObject = paramIntent;
        if (!str4.equals("")) {
          localObject = paramIntent + str4 + ",";
        }
      }
      paramIntent = (Intent)localObject;
      if (str3 != null)
      {
        paramIntent = (Intent)localObject;
        if (!str3.equals("")) {
          paramIntent = localObject + str3 + ",";
        }
      }
      localObject = paramIntent;
      if (str2 != null)
      {
        localObject = paramIntent;
        if (!str2.equals("")) {
          localObject = paramIntent + str2 + ",";
        }
      }
      paramIntent = (Intent)localObject;
      if (str1 != null)
      {
        paramIntent = (Intent)localObject;
        if (!str1.equals("")) {
          paramIntent = localObject + str1;
        }
      }
      if (paramIntent != null)
      {
        localObject = paramIntent;
        if (paramIntent.charAt(paramIntent.length() - 1) == ',') {
          localObject = paramIntent.substring(0, paramIntent.length() - 1);
        }
        m[paramInt1] = localObject;
        paramInt1 += 1;
      }
    }
    label747:
    Toast.makeText(l, 2131230804, 0).show();
  }
  
  public void onBackPressed()
  {
    if (!e()) {
      super.onBackPressed();
    }
  }
  
  /* Error */
  protected void onCreate(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 747	com/google/android/maps/MapActivity:onCreate	(Landroid/os/Bundle;)V
    //   5: aload_0
    //   6: ldc_w 748
    //   9: invokevirtual 751	com/incorporateapps/fakegps/fre/Maps:setContentView	(I)V
    //   12: aload_0
    //   13: aload_0
    //   14: putfield 311	com/incorporateapps/fakegps/fre/Maps:l	Landroid/content/Context;
    //   17: aload_0
    //   18: new 753	com/incorporateapps/fakegps/fre/DB
    //   21: dup
    //   22: aload_0
    //   23: getfield 311	com/incorporateapps/fakegps/fre/Maps:l	Landroid/content/Context;
    //   26: invokespecial 754	com/incorporateapps/fakegps/fre/DB:<init>	(Landroid/content/Context;)V
    //   29: putfield 756	com/incorporateapps/fakegps/fre/Maps:B	Lcom/incorporateapps/fakegps/fre/DB;
    //   32: aload_0
    //   33: getfield 756	com/incorporateapps/fakegps/fre/Maps:B	Lcom/incorporateapps/fakegps/fre/DB;
    //   36: invokevirtual 759	com/incorporateapps/fakegps/fre/DB:a	()Lcom/incorporateapps/fakegps/fre/DB;
    //   39: pop
    //   40: aload_0
    //   41: aload_0
    //   42: getfield 311	com/incorporateapps/fakegps/fre/Maps:l	Landroid/content/Context;
    //   45: invokestatic 765	android/preference/PreferenceManager:getDefaultSharedPreferences	(Landroid/content/Context;)Landroid/content/SharedPreferences;
    //   48: putfield 767	com/incorporateapps/fakegps/fre/Maps:o	Landroid/content/SharedPreferences;
    //   51: aload_0
    //   52: aload_0
    //   53: getfield 767	com/incorporateapps/fakegps/fre/Maps:o	Landroid/content/SharedPreferences;
    //   56: invokeinterface 773 1 0
    //   61: putfield 546	com/incorporateapps/fakegps/fre/Maps:p	Landroid/content/SharedPreferences$Editor;
    //   64: aload_0
    //   65: getfield 311	com/incorporateapps/fakegps/fre/Maps:l	Landroid/content/Context;
    //   68: invokestatic 778	android/view/ViewConfiguration:get	(Landroid/content/Context;)Landroid/view/ViewConfiguration;
    //   71: astore_1
    //   72: ldc_w 775
    //   75: ldc_w 780
    //   78: invokevirtual 786	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   81: astore 8
    //   83: aload 8
    //   85: ifnull +16 -> 101
    //   88: aload 8
    //   90: iconst_1
    //   91: invokevirtual 792	java/lang/reflect/Field:setAccessible	(Z)V
    //   94: aload 8
    //   96: aload_1
    //   97: iconst_0
    //   98: invokevirtual 796	java/lang/reflect/Field:setBoolean	(Ljava/lang/Object;Z)V
    //   101: aload_0
    //   102: aload_0
    //   103: invokestatic 801	com/google/android/gms/analytics/GoogleAnalytics:getInstance	(Landroid/content/Context;)Lcom/google/android/gms/analytics/GoogleAnalytics;
    //   106: putfield 803	com/incorporateapps/fakegps/fre/Maps:v	Lcom/google/android/gms/analytics/GoogleAnalytics;
    //   109: aload_0
    //   110: getfield 767	com/incorporateapps/fakegps/fre/Maps:o	Landroid/content/SharedPreferences;
    //   113: ldc_w 805
    //   116: iconst_0
    //   117: invokeinterface 809 3 0
    //   122: ifne +70 -> 192
    //   125: new 344	android/app/AlertDialog$Builder
    //   128: dup
    //   129: aload_0
    //   130: getfield 311	com/incorporateapps/fakegps/fre/Maps:l	Landroid/content/Context;
    //   133: invokespecial 347	android/app/AlertDialog$Builder:<init>	(Landroid/content/Context;)V
    //   136: ldc_w 348
    //   139: invokevirtual 352	android/app/AlertDialog$Builder:setIcon	(I)Landroid/app/AlertDialog$Builder;
    //   142: iconst_0
    //   143: invokevirtual 405	android/app/AlertDialog$Builder:setCancelable	(Z)Landroid/app/AlertDialog$Builder;
    //   146: ldc_w 810
    //   149: invokevirtual 356	android/app/AlertDialog$Builder:setTitle	(I)Landroid/app/AlertDialog$Builder;
    //   152: ldc_w 811
    //   155: invokevirtual 360	android/app/AlertDialog$Builder:setMessage	(I)Landroid/app/AlertDialog$Builder;
    //   158: ldc_w 812
    //   161: new 814	com/incorporateapps/fakegps/fre/aq
    //   164: dup
    //   165: aload_0
    //   166: invokespecial 815	com/incorporateapps/fakegps/fre/aq:<init>	(Lcom/incorporateapps/fakegps/fre/Maps;)V
    //   169: invokevirtual 375	android/app/AlertDialog$Builder:setNegativeButton	(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    //   172: ldc_w 816
    //   175: new 818	com/incorporateapps/fakegps/fre/ar
    //   178: dup
    //   179: aload_0
    //   180: invokespecial 819	com/incorporateapps/fakegps/fre/ar:<init>	(Lcom/incorporateapps/fakegps/fre/Maps;)V
    //   183: invokevirtual 368	android/app/AlertDialog$Builder:setPositiveButton	(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    //   186: invokevirtual 379	android/app/AlertDialog$Builder:create	()Landroid/app/AlertDialog;
    //   189: invokevirtual 384	android/app/AlertDialog:show	()V
    //   192: aload_0
    //   193: getfield 803	com/incorporateapps/fakegps/fre/Maps:v	Lcom/google/android/gms/analytics/GoogleAnalytics;
    //   196: ldc_w 820
    //   199: invokevirtual 824	com/google/android/gms/analytics/GoogleAnalytics:newTracker	(I)Lcom/google/android/gms/analytics/Tracker;
    //   202: astore_1
    //   203: aload_1
    //   204: ldc_w 826
    //   207: invokevirtual 831	com/google/android/gms/analytics/Tracker:setScreenName	(Ljava/lang/String;)V
    //   210: aload_1
    //   211: new 833	com/google/android/gms/analytics/HitBuilders$AppViewBuilder
    //   214: dup
    //   215: invokespecial 834	com/google/android/gms/analytics/HitBuilders$AppViewBuilder:<init>	()V
    //   218: invokevirtual 838	com/google/android/gms/analytics/HitBuilders$AppViewBuilder:build	()Ljava/util/Map;
    //   221: invokevirtual 842	com/google/android/gms/analytics/Tracker:send	(Ljava/util/Map;)V
    //   224: aload_0
    //   225: aload_0
    //   226: invokevirtual 846	com/incorporateapps/fakegps/fre/Maps:getBaseContext	()Landroid/content/Context;
    //   229: invokestatic 852	com/google/android/gms/common/GooglePlayServicesUtil:isGooglePlayServicesAvailable	(Landroid/content/Context;)I
    //   232: putfield 854	com/incorporateapps/fakegps/fre/Maps:z	I
    //   235: aload_0
    //   236: getfield 854	com/incorporateapps/fakegps/fre/Maps:z	I
    //   239: ifne +81 -> 320
    //   242: aload_0
    //   243: new 497	com/google/android/gms/ads/InterstitialAd
    //   246: dup
    //   247: aload_0
    //   248: invokespecial 855	com/google/android/gms/ads/InterstitialAd:<init>	(Landroid/content/Context;)V
    //   251: putfield 495	com/incorporateapps/fakegps/fre/Maps:N	Lcom/google/android/gms/ads/InterstitialAd;
    //   254: aload_0
    //   255: getfield 495	com/incorporateapps/fakegps/fre/Maps:N	Lcom/google/android/gms/ads/InterstitialAd;
    //   258: aload_0
    //   259: ldc_w 856
    //   262: invokevirtual 249	com/incorporateapps/fakegps/fre/Maps:getString	(I)Ljava/lang/String;
    //   265: invokevirtual 859	com/google/android/gms/ads/InterstitialAd:setAdUnitId	(Ljava/lang/String;)V
    //   268: aload_0
    //   269: getfield 495	com/incorporateapps/fakegps/fre/Maps:N	Lcom/google/android/gms/ads/InterstitialAd;
    //   272: new 861	com/incorporateapps/fakegps/fre/as
    //   275: dup
    //   276: aload_0
    //   277: invokespecial 862	com/incorporateapps/fakegps/fre/as:<init>	(Lcom/incorporateapps/fakegps/fre/Maps;)V
    //   280: invokevirtual 866	com/google/android/gms/ads/InterstitialAd:setAdListener	(Lcom/google/android/gms/ads/AdListener;)V
    //   283: new 868	com/google/android/gms/ads/AdRequest$Builder
    //   286: dup
    //   287: invokespecial 869	com/google/android/gms/ads/AdRequest$Builder:<init>	()V
    //   290: getstatic 874	com/google/android/gms/ads/AdRequest:DEVICE_ID_EMULATOR	Ljava/lang/String;
    //   293: invokevirtual 878	com/google/android/gms/ads/AdRequest$Builder:addTestDevice	(Ljava/lang/String;)Lcom/google/android/gms/ads/AdRequest$Builder;
    //   296: ldc_w 880
    //   299: invokevirtual 878	com/google/android/gms/ads/AdRequest$Builder:addTestDevice	(Ljava/lang/String;)Lcom/google/android/gms/ads/AdRequest$Builder;
    //   302: ldc_w 882
    //   305: invokevirtual 878	com/google/android/gms/ads/AdRequest$Builder:addTestDevice	(Ljava/lang/String;)Lcom/google/android/gms/ads/AdRequest$Builder;
    //   308: invokevirtual 885	com/google/android/gms/ads/AdRequest$Builder:build	()Lcom/google/android/gms/ads/AdRequest;
    //   311: astore_1
    //   312: aload_0
    //   313: getfield 495	com/incorporateapps/fakegps/fre/Maps:N	Lcom/google/android/gms/ads/InterstitialAd;
    //   316: aload_1
    //   317: invokevirtual 889	com/google/android/gms/ads/InterstitialAd:loadAd	(Lcom/google/android/gms/ads/AdRequest;)V
    //   320: aload_0
    //   321: aload_0
    //   322: ldc_w 890
    //   325: invokevirtual 891	com/incorporateapps/fakegps/fre/Maps:findViewById	(I)Landroid/view/View;
    //   328: checkcast 517	com/google/android/maps/MapView
    //   331: putfield 305	com/incorporateapps/fakegps/fre/Maps:D	Lcom/google/android/maps/MapView;
    //   334: aload_0
    //   335: aload_0
    //   336: invokevirtual 506	com/incorporateapps/fakegps/fre/Maps:getResources	()Landroid/content/res/Resources;
    //   339: ldc_w 507
    //   342: invokevirtual 513	android/content/res/Resources:getDrawable	(I)Landroid/graphics/drawable/Drawable;
    //   345: putfield 893	com/incorporateapps/fakegps/fre/Maps:k	Landroid/graphics/drawable/Drawable;
    //   348: aload_0
    //   349: new 895	com/incorporateapps/fakegps/fre/v
    //   352: dup
    //   353: aload_0
    //   354: invokespecial 896	com/incorporateapps/fakegps/fre/v:<init>	(Lcom/incorporateapps/fakegps/fre/Maps;)V
    //   357: putfield 898	com/incorporateapps/fakegps/fre/Maps:F	Lcom/google/android/maps/Overlay;
    //   360: aload_0
    //   361: getfield 305	com/incorporateapps/fakegps/fre/Maps:D	Lcom/google/android/maps/MapView;
    //   364: invokevirtual 521	com/google/android/maps/MapView:getOverlays	()Ljava/util/List;
    //   367: aload_0
    //   368: getfield 898	com/incorporateapps/fakegps/fre/Maps:F	Lcom/google/android/maps/Overlay;
    //   371: invokeinterface 544 2 0
    //   376: pop
    //   377: aload_0
    //   378: new 605	android/content/Intent
    //   381: dup
    //   382: aload_0
    //   383: getfield 311	com/incorporateapps/fakegps/fre/Maps:l	Landroid/content/Context;
    //   386: ldc_w 900
    //   389: invokespecial 903	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   392: putfield 463	com/incorporateapps/fakegps/fre/Maps:q	Landroid/content/Intent;
    //   395: aload_0
    //   396: aload_0
    //   397: getfield 305	com/incorporateapps/fakegps/fre/Maps:D	Lcom/google/android/maps/MapView;
    //   400: invokevirtual 907	com/google/android/maps/MapView:getController	()Lcom/google/android/maps/MapController;
    //   403: putfield 490	com/incorporateapps/fakegps/fre/Maps:C	Lcom/google/android/maps/MapController;
    //   406: aload_0
    //   407: getfield 305	com/incorporateapps/fakegps/fre/Maps:D	Lcom/google/android/maps/MapView;
    //   410: iconst_1
    //   411: invokevirtual 910	com/google/android/maps/MapView:setBuiltInZoomControls	(Z)V
    //   414: aload_0
    //   415: getfield 305	com/incorporateapps/fakegps/fre/Maps:D	Lcom/google/android/maps/MapView;
    //   418: iconst_1
    //   419: invokevirtual 913	com/google/android/maps/MapView:displayZoomControls	(Z)V
    //   422: aload_0
    //   423: getfield 305	com/incorporateapps/fakegps/fre/Maps:D	Lcom/google/android/maps/MapView;
    //   426: iconst_1
    //   427: invokevirtual 916	com/google/android/maps/MapView:setVerticalScrollBarEnabled	(Z)V
    //   430: aload_0
    //   431: getfield 767	com/incorporateapps/fakegps/fre/Maps:o	Landroid/content/SharedPreferences;
    //   434: ldc_w 918
    //   437: iconst_0
    //   438: invokeinterface 921 3 0
    //   443: ifle +688 -> 1131
    //   446: aload_0
    //   447: getfield 305	com/incorporateapps/fakegps/fre/Maps:D	Lcom/google/android/maps/MapView;
    //   450: iconst_1
    //   451: invokevirtual 924	com/google/android/maps/MapView:setSatellite	(Z)V
    //   454: aload_0
    //   455: getfield 490	com/incorporateapps/fakegps/fre/Maps:C	Lcom/google/android/maps/MapController;
    //   458: bipush 14
    //   460: invokevirtual 930	com/google/android/maps/MapController:setZoom	(I)I
    //   463: pop
    //   464: aload_0
    //   465: invokevirtual 934	com/incorporateapps/fakegps/fre/Maps:getIntent	()Landroid/content/Intent;
    //   468: astore_1
    //   469: aload_1
    //   470: ifnull +163 -> 633
    //   473: aload_1
    //   474: invokevirtual 643	android/content/Intent:getData	()Landroid/net/Uri;
    //   477: astore_1
    //   478: aload_1
    //   479: ifnull +154 -> 633
    //   482: aload_1
    //   483: invokevirtual 935	android/net/Uri:toString	()Ljava/lang/String;
    //   486: astore_1
    //   487: aload_1
    //   488: ldc_w 937
    //   491: invokevirtual 941	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   494: ifeq +139 -> 633
    //   497: aload_1
    //   498: invokevirtual 729	java/lang/String:length	()I
    //   501: iconst_5
    //   502: if_icmple +131 -> 633
    //   505: aload_1
    //   506: iconst_4
    //   507: invokevirtual 943	java/lang/String:substring	(I)Ljava/lang/String;
    //   510: ldc_w 945
    //   513: invokevirtual 216	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   516: astore_1
    //   517: aload_1
    //   518: iconst_0
    //   519: aaload
    //   520: invokestatic 947	com/incorporateapps/fakegps/fre/Maps:b	(Ljava/lang/String;)Landroid/location/Location;
    //   523: astore 8
    //   525: ldc_w 949
    //   528: new 609	java/lang/StringBuilder
    //   531: dup
    //   532: invokespecial 950	java/lang/StringBuilder:<init>	()V
    //   535: aload 8
    //   537: invokevirtual 953	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   540: ldc_w 955
    //   543: invokevirtual 616	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   546: aload_1
    //   547: iconst_0
    //   548: aaload
    //   549: invokevirtual 616	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   552: invokevirtual 617	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   555: invokestatic 569	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   558: pop
    //   559: aload 8
    //   561: ifnull +72 -> 633
    //   564: aload 8
    //   566: invokevirtual 958	android/location/Location:getLatitude	()D
    //   569: dstore_2
    //   570: aload 8
    //   572: invokevirtual 961	android/location/Location:getLongitude	()D
    //   575: dstore 4
    //   577: aload_0
    //   578: new 252	com/google/android/maps/GeoPoint
    //   581: dup
    //   582: dload_2
    //   583: ldc2_w 257
    //   586: dmul
    //   587: invokestatic 964	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   590: invokevirtual 967	java/lang/Double:intValue	()I
    //   593: dload 4
    //   595: ldc2_w 257
    //   598: dmul
    //   599: invokestatic 964	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   602: invokevirtual 967	java/lang/Double:intValue	()I
    //   605: invokespecial 970	com/google/android/maps/GeoPoint:<init>	(II)V
    //   608: putfield 202	com/incorporateapps/fakegps/fre/Maps:E	Lcom/google/android/maps/GeoPoint;
    //   611: aload_0
    //   612: aload_0
    //   613: getfield 202	com/incorporateapps/fakegps/fre/Maps:E	Lcom/google/android/maps/GeoPoint;
    //   616: invokevirtual 971	com/incorporateapps/fakegps/fre/Maps:a	(Lcom/google/android/maps/GeoPoint;)V
    //   619: aload_0
    //   620: getfield 305	com/incorporateapps/fakegps/fre/Maps:D	Lcom/google/android/maps/MapView;
    //   623: invokevirtual 907	com/google/android/maps/MapView:getController	()Lcom/google/android/maps/MapController;
    //   626: aload_0
    //   627: getfield 202	com/incorporateapps/fakegps/fre/Maps:E	Lcom/google/android/maps/GeoPoint;
    //   630: invokevirtual 974	com/google/android/maps/MapController:animateTo	(Lcom/google/android/maps/GeoPoint;)V
    //   633: getstatic 319	android/os/Build$VERSION:SDK_INT	I
    //   636: istore 6
    //   638: iload 6
    //   640: bipush 23
    //   642: if_icmplt +527 -> 1169
    //   645: aload_0
    //   646: ldc_w 321
    //   649: invokevirtual 325	com/incorporateapps/fakegps/fre/Maps:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   652: checkcast 327	android/app/AppOpsManager
    //   655: ldc_w 329
    //   658: invokestatic 334	android/os/Process:myUid	()I
    //   661: aload_0
    //   662: invokevirtual 338	com/incorporateapps/fakegps/fre/Maps:getPackageName	()Ljava/lang/String;
    //   665: invokevirtual 342	android/app/AppOpsManager:checkOp	(Ljava/lang/String;ILjava/lang/String;)I
    //   668: istore 6
    //   670: iload 6
    //   672: ifne +484 -> 1156
    //   675: iconst_1
    //   676: istore 6
    //   678: iload 6
    //   680: ifne +7 -> 687
    //   683: aload_0
    //   684: invokespecial 632	com/incorporateapps/fakegps/fre/Maps:g	()V
    //   687: aload_0
    //   688: aload_0
    //   689: ldc_w 975
    //   692: invokevirtual 891	com/incorporateapps/fakegps/fre/Maps:findViewById	(I)Landroid/view/View;
    //   695: checkcast 977	android/widget/ImageView
    //   698: putfield 979	com/incorporateapps/fakegps/fre/Maps:a	Landroid/widget/ImageView;
    //   701: aload_0
    //   702: getfield 979	com/incorporateapps/fakegps/fre/Maps:a	Landroid/widget/ImageView;
    //   705: new 981	com/incorporateapps/fakegps/fre/ae
    //   708: dup
    //   709: aload_0
    //   710: invokespecial 982	com/incorporateapps/fakegps/fre/ae:<init>	(Lcom/incorporateapps/fakegps/fre/Maps;)V
    //   713: invokevirtual 986	android/widget/ImageView:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   716: aload_0
    //   717: aload_0
    //   718: ldc_w 987
    //   721: invokevirtual 891	com/incorporateapps/fakegps/fre/Maps:findViewById	(I)Landroid/view/View;
    //   724: checkcast 977	android/widget/ImageView
    //   727: putfield 989	com/incorporateapps/fakegps/fre/Maps:b	Landroid/widget/ImageView;
    //   730: aload_0
    //   731: getfield 989	com/incorporateapps/fakegps/fre/Maps:b	Landroid/widget/ImageView;
    //   734: new 991	com/incorporateapps/fakegps/fre/af
    //   737: dup
    //   738: aload_0
    //   739: invokespecial 992	com/incorporateapps/fakegps/fre/af:<init>	(Lcom/incorporateapps/fakegps/fre/Maps;)V
    //   742: invokevirtual 986	android/widget/ImageView:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   745: aload_0
    //   746: aload_0
    //   747: getfield 767	com/incorporateapps/fakegps/fre/Maps:o	Landroid/content/SharedPreferences;
    //   750: ldc_w 994
    //   753: iconst_0
    //   754: invokeinterface 921 3 0
    //   759: putfield 149	com/incorporateapps/fakegps/fre/Maps:y	I
    //   762: aload_0
    //   763: aload_0
    //   764: getfield 767	com/incorporateapps/fakegps/fre/Maps:o	Landroid/content/SharedPreferences;
    //   767: ldc_w 996
    //   770: iconst_0
    //   771: invokeinterface 809 3 0
    //   776: putfield 95	com/incorporateapps/fakegps/fre/Maps:c	Z
    //   779: aload_0
    //   780: getfield 767	com/incorporateapps/fakegps/fre/Maps:o	Landroid/content/SharedPreferences;
    //   783: ldc_w 998
    //   786: iconst_1
    //   787: invokeinterface 809 3 0
    //   792: ifeq +76 -> 868
    //   795: new 344	android/app/AlertDialog$Builder
    //   798: dup
    //   799: aload_0
    //   800: getfield 311	com/incorporateapps/fakegps/fre/Maps:l	Landroid/content/Context;
    //   803: invokespecial 347	android/app/AlertDialog$Builder:<init>	(Landroid/content/Context;)V
    //   806: ldc_w 348
    //   809: invokevirtual 352	android/app/AlertDialog$Builder:setIcon	(I)Landroid/app/AlertDialog$Builder;
    //   812: ldc_w 999
    //   815: invokevirtual 356	android/app/AlertDialog$Builder:setTitle	(I)Landroid/app/AlertDialog$Builder;
    //   818: ldc_w 1000
    //   821: invokevirtual 360	android/app/AlertDialog$Builder:setMessage	(I)Landroid/app/AlertDialog$Builder;
    //   824: ldc_w 1001
    //   827: new 1003	com/incorporateapps/fakegps/fre/o
    //   830: dup
    //   831: aload_0
    //   832: invokespecial 1004	com/incorporateapps/fakegps/fre/o:<init>	(Lcom/incorporateapps/fakegps/fre/Maps;)V
    //   835: invokevirtual 368	android/app/AlertDialog$Builder:setPositiveButton	(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    //   838: invokevirtual 379	android/app/AlertDialog$Builder:create	()Landroid/app/AlertDialog;
    //   841: invokevirtual 384	android/app/AlertDialog:show	()V
    //   844: aload_0
    //   845: getfield 546	com/incorporateapps/fakegps/fre/Maps:p	Landroid/content/SharedPreferences$Editor;
    //   848: ldc_w 998
    //   851: iconst_0
    //   852: invokeinterface 1008 3 0
    //   857: pop
    //   858: aload_0
    //   859: getfield 546	com/incorporateapps/fakegps/fre/Maps:p	Landroid/content/SharedPreferences$Editor;
    //   862: invokeinterface 559 1 0
    //   867: pop
    //   868: aload_0
    //   869: getfield 149	com/incorporateapps/fakegps/fre/Maps:y	I
    //   872: ifle +110 -> 982
    //   875: aload_0
    //   876: getfield 149	com/incorporateapps/fakegps/fre/Maps:y	I
    //   879: bipush 11
    //   881: irem
    //   882: ifne +100 -> 982
    //   885: aload_0
    //   886: getfield 149	com/incorporateapps/fakegps/fre/Maps:y	I
    //   889: bipush 23
    //   891: if_icmpge +91 -> 982
    //   894: aload_0
    //   895: getfield 95	com/incorporateapps/fakegps/fre/Maps:c	Z
    //   898: istore 7
    //   900: iload 7
    //   902: ifne +80 -> 982
    //   905: new 344	android/app/AlertDialog$Builder
    //   908: dup
    //   909: aload_0
    //   910: getfield 311	com/incorporateapps/fakegps/fre/Maps:l	Landroid/content/Context;
    //   913: invokespecial 347	android/app/AlertDialog$Builder:<init>	(Landroid/content/Context;)V
    //   916: ldc_w 348
    //   919: invokevirtual 352	android/app/AlertDialog$Builder:setIcon	(I)Landroid/app/AlertDialog$Builder;
    //   922: ldc_w 1009
    //   925: invokevirtual 356	android/app/AlertDialog$Builder:setTitle	(I)Landroid/app/AlertDialog$Builder;
    //   928: ldc_w 1010
    //   931: invokevirtual 360	android/app/AlertDialog$Builder:setMessage	(I)Landroid/app/AlertDialog$Builder;
    //   934: ldc_w 1011
    //   937: new 1013	com/incorporateapps/fakegps/fre/aj
    //   940: dup
    //   941: aload_0
    //   942: invokespecial 1014	com/incorporateapps/fakegps/fre/aj:<init>	(Lcom/incorporateapps/fakegps/fre/Maps;)V
    //   945: invokevirtual 368	android/app/AlertDialog$Builder:setPositiveButton	(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    //   948: ldc_w 1015
    //   951: new 1017	com/incorporateapps/fakegps/fre/ak
    //   954: dup
    //   955: aload_0
    //   956: invokespecial 1018	com/incorporateapps/fakegps/fre/ak:<init>	(Lcom/incorporateapps/fakegps/fre/Maps;)V
    //   959: invokevirtual 375	android/app/AlertDialog$Builder:setNegativeButton	(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    //   962: ldc_w 1019
    //   965: new 1021	com/incorporateapps/fakegps/fre/al
    //   968: dup
    //   969: aload_0
    //   970: invokespecial 1022	com/incorporateapps/fakegps/fre/al:<init>	(Lcom/incorporateapps/fakegps/fre/Maps;)V
    //   973: invokevirtual 1025	android/app/AlertDialog$Builder:setNeutralButton	(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    //   976: invokevirtual 379	android/app/AlertDialog$Builder:create	()Landroid/app/AlertDialog;
    //   979: invokevirtual 384	android/app/AlertDialog:show	()V
    //   982: aload_0
    //   983: getfield 149	com/incorporateapps/fakegps/fre/Maps:y	I
    //   986: istore 6
    //   988: aload_0
    //   989: getfield 546	com/incorporateapps/fakegps/fre/Maps:p	Landroid/content/SharedPreferences$Editor;
    //   992: ldc_w 994
    //   995: iload 6
    //   997: iconst_1
    //   998: iadd
    //   999: invokeinterface 1029 3 0
    //   1004: pop
    //   1005: aload_0
    //   1006: getfield 546	com/incorporateapps/fakegps/fre/Maps:p	Landroid/content/SharedPreferences$Editor;
    //   1009: invokeinterface 559 1 0
    //   1014: pop
    //   1015: aload_0
    //   1016: ldc_w 1031
    //   1019: invokevirtual 325	com/incorporateapps/fakegps/fre/Maps:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   1022: checkcast 1033	android/location/LocationManager
    //   1025: ldc_w 1035
    //   1028: invokevirtual 1038	android/location/LocationManager:isProviderEnabled	(Ljava/lang/String;)Z
    //   1031: ifne +7 -> 1038
    //   1034: aload_0
    //   1035: invokespecial 1040	com/incorporateapps/fakegps/fre/Maps:f	()V
    //   1038: return
    //   1039: astore_1
    //   1040: getstatic 89	com/incorporateapps/fakegps/fre/Maps:A	Ljava/lang/String;
    //   1043: new 609	java/lang/StringBuilder
    //   1046: dup
    //   1047: ldc_w 1042
    //   1050: invokespecial 612	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1053: aload_1
    //   1054: invokevirtual 564	java/lang/Exception:toString	()Ljava/lang/String;
    //   1057: invokevirtual 616	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1060: invokevirtual 617	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1063: invokestatic 569	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   1066: pop
    //   1067: goto -843 -> 224
    //   1070: astore_1
    //   1071: aload_1
    //   1072: invokevirtual 1043	java/lang/Exception:printStackTrace	()V
    //   1075: aload_0
    //   1076: invokevirtual 474	com/incorporateapps/fakegps/fre/Maps:finish	()V
    //   1079: aload_0
    //   1080: new 605	android/content/Intent
    //   1083: dup
    //   1084: aload_0
    //   1085: getfield 311	com/incorporateapps/fakegps/fre/Maps:l	Landroid/content/Context;
    //   1088: ldc_w 1045
    //   1091: invokespecial 903	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   1094: invokevirtual 630	com/incorporateapps/fakegps/fre/Maps:startActivity	(Landroid/content/Intent;)V
    //   1097: goto -82 -> 1015
    //   1100: astore_1
    //   1101: getstatic 89	com/incorporateapps/fakegps/fre/Maps:A	Ljava/lang/String;
    //   1104: new 609	java/lang/StringBuilder
    //   1107: dup
    //   1108: ldc_w 1047
    //   1111: invokespecial 612	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1114: aload_1
    //   1115: invokevirtual 564	java/lang/Exception:toString	()Ljava/lang/String;
    //   1118: invokevirtual 616	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1121: invokevirtual 617	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1124: invokestatic 569	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   1127: pop
    //   1128: goto -808 -> 320
    //   1131: aload_0
    //   1132: getfield 305	com/incorporateapps/fakegps/fre/Maps:D	Lcom/google/android/maps/MapView;
    //   1135: iconst_0
    //   1136: invokevirtual 924	com/google/android/maps/MapView:setSatellite	(Z)V
    //   1139: goto -685 -> 454
    //   1142: astore_1
    //   1143: ldc 87
    //   1145: aload_1
    //   1146: invokevirtual 564	java/lang/Exception:toString	()Ljava/lang/String;
    //   1149: invokestatic 569	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   1152: pop
    //   1153: goto -520 -> 633
    //   1156: iconst_0
    //   1157: istore 6
    //   1159: goto -481 -> 678
    //   1162: astore_1
    //   1163: iconst_0
    //   1164: istore 6
    //   1166: goto -488 -> 678
    //   1169: aload_0
    //   1170: invokevirtual 388	com/incorporateapps/fakegps/fre/Maps:getContentResolver	()Landroid/content/ContentResolver;
    //   1173: ldc_w 390
    //   1176: invokestatic 396	android/provider/Settings$Secure:getInt	(Landroid/content/ContentResolver;Ljava/lang/String;)I
    //   1179: ifgt -492 -> 687
    //   1182: aload_0
    //   1183: invokespecial 632	com/incorporateapps/fakegps/fre/Maps:g	()V
    //   1186: goto -499 -> 687
    //   1189: astore_1
    //   1190: aload_1
    //   1191: invokevirtual 1043	java/lang/Exception:printStackTrace	()V
    //   1194: goto -507 -> 687
    //   1197: astore_1
    //   1198: aload_1
    //   1199: invokevirtual 1043	java/lang/Exception:printStackTrace	()V
    //   1202: goto -220 -> 982
    //   1205: astore_1
    //   1206: goto -982 -> 224
    //   1209: astore_1
    //   1210: goto -1109 -> 101
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1213	0	this	Maps
    //   0	1213	1	paramBundle	android.os.Bundle
    //   569	14	2	d1	double
    //   575	19	4	d2	double
    //   636	529	6	i1	int
    //   898	3	7	bool	boolean
    //   81	490	8	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   101	192	1039	java/lang/Exception
    //   17	64	1070	java/lang/Exception
    //   320	454	1070	java/lang/Exception
    //   454	469	1070	java/lang/Exception
    //   473	478	1070	java/lang/Exception
    //   482	487	1070	java/lang/Exception
    //   687	868	1070	java/lang/Exception
    //   868	900	1070	java/lang/Exception
    //   982	1015	1070	java/lang/Exception
    //   1040	1067	1070	java/lang/Exception
    //   1101	1128	1070	java/lang/Exception
    //   1131	1139	1070	java/lang/Exception
    //   1143	1153	1070	java/lang/Exception
    //   1190	1194	1070	java/lang/Exception
    //   1198	1202	1070	java/lang/Exception
    //   224	320	1100	java/lang/Exception
    //   487	559	1142	java/lang/Exception
    //   564	633	1142	java/lang/Exception
    //   645	670	1162	java/lang/Exception
    //   633	638	1189	java/lang/Exception
    //   683	687	1189	java/lang/Exception
    //   1169	1186	1189	java/lang/Exception
    //   905	982	1197	java/lang/Exception
    //   192	224	1205	java/lang/Exception
    //   64	83	1209	java/lang/Exception
    //   88	101	1209	java/lang/Exception
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131623936, paramMenu);
    paramMenu.add(0, 1, 0, 2131230875).setIcon(17301547);
    paramMenu.add(0, 2, 0, 2131230793).setIcon(17301578);
    paramMenu.add(0, 3, 0, 2131230792).setIcon(17301582);
    paramMenu.add(0, 7, 0, 2131230838).setIcon(17301573);
    paramMenu.add(0, 9, 0, 2131230876).setIcon(17301577);
    paramMenu.add(0, 8, 0, 2131230796).setIcon(17301547);
    return super.onCreateOptionsMenu(paramMenu);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (B != null) {
      B.b();
    }
  }
  
  /* Error */
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 1091	com/google/android/maps/MapActivity:onOptionsItemSelected	(Landroid/view/MenuItem;)Z
    //   5: pop
    //   6: aload_1
    //   7: invokeinterface 1094 1 0
    //   12: lookupswitch	default:+652->664, 1:+459->471, 2:+646->658, 3:+640->652, 7:+497->509, 8:+514->526, 9:+437->449, 2131361928:+358->370, 2131361929:+223->235, 2131361930:+90->102
    //   96: aload_0
    //   97: aload_1
    //   98: invokespecial 1091	com/google/android/maps/MapActivity:onOptionsItemSelected	(Landroid/view/MenuItem;)Z
    //   101: ireturn
    //   102: aload_0
    //   103: getfield 311	com/incorporateapps/fakegps/fre/Maps:l	Landroid/content/Context;
    //   106: invokestatic 1096	com/incorporateapps/fakegps/fre/MyFunctions:a	(Landroid/content/Context;)Z
    //   109: ifne +113 -> 222
    //   112: aload_0
    //   113: new 574	android/app/ProgressDialog
    //   116: dup
    //   117: aload_0
    //   118: invokespecial 1097	android/app/ProgressDialog:<init>	(Landroid/content/Context;)V
    //   121: putfield 105	com/incorporateapps/fakegps/fre/Maps:I	Landroid/app/ProgressDialog;
    //   124: aload_0
    //   125: getfield 105	com/incorporateapps/fakegps/fre/Maps:I	Landroid/app/ProgressDialog;
    //   128: iconst_0
    //   129: invokevirtual 1100	android/app/ProgressDialog:setProgressStyle	(I)V
    //   132: aload_0
    //   133: getfield 105	com/incorporateapps/fakegps/fre/Maps:I	Landroid/app/ProgressDialog;
    //   136: aload_0
    //   137: ldc_w 1101
    //   140: invokevirtual 249	com/incorporateapps/fakegps/fre/Maps:getString	(I)Ljava/lang/String;
    //   143: invokevirtual 1104	android/app/ProgressDialog:setMessage	(Ljava/lang/CharSequence;)V
    //   146: aload_0
    //   147: getfield 105	com/incorporateapps/fakegps/fre/Maps:I	Landroid/app/ProgressDialog;
    //   150: ldc_w 571
    //   153: invokevirtual 1106	android/app/ProgressDialog:setTitle	(I)V
    //   156: aload_0
    //   157: getfield 105	com/incorporateapps/fakegps/fre/Maps:I	Landroid/app/ProgressDialog;
    //   160: bipush -2
    //   162: aload_0
    //   163: ldc_w 361
    //   166: invokevirtual 249	com/incorporateapps/fakegps/fre/Maps:getString	(I)Ljava/lang/String;
    //   169: new 1108	com/incorporateapps/fakegps/fre/y
    //   172: dup
    //   173: aload_0
    //   174: invokespecial 1109	com/incorporateapps/fakegps/fre/y:<init>	(Lcom/incorporateapps/fakegps/fre/Maps;)V
    //   177: invokevirtual 1113	android/app/ProgressDialog:setButton	(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V
    //   180: aload_0
    //   181: getfield 105	com/incorporateapps/fakegps/fre/Maps:I	Landroid/app/ProgressDialog;
    //   184: iconst_1
    //   185: invokevirtual 1115	android/app/ProgressDialog:setCancelable	(Z)V
    //   188: aload_0
    //   189: getfield 105	com/incorporateapps/fakegps/fre/Maps:I	Landroid/app/ProgressDialog;
    //   192: invokevirtual 1116	android/app/ProgressDialog:show	()V
    //   195: new 1118	com/incorporateapps/fakegps/fre/ai
    //   198: dup
    //   199: aload_0
    //   200: invokespecial 1119	com/incorporateapps/fakegps/fre/ai:<init>	(Lcom/incorporateapps/fakegps/fre/Maps;)V
    //   203: invokevirtual 587	java/lang/Thread:start	()V
    //   206: iconst_1
    //   207: ireturn
    //   208: astore_1
    //   209: ldc_w 1121
    //   212: aload_1
    //   213: invokevirtual 564	java/lang/Exception:toString	()Ljava/lang/String;
    //   216: invokestatic 1123	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   219: pop
    //   220: iconst_0
    //   221: ireturn
    //   222: aload_0
    //   223: ldc_w 1124
    //   226: iconst_0
    //   227: invokestatic 481	android/widget/Toast:makeText	(Landroid/content/Context;II)Landroid/widget/Toast;
    //   230: invokevirtual 482	android/widget/Toast:show	()V
    //   233: iconst_1
    //   234: ireturn
    //   235: aload_0
    //   236: ldc_w 1125
    //   239: invokevirtual 249	com/incorporateapps/fakegps/fre/Maps:getString	(I)Ljava/lang/String;
    //   242: astore_1
    //   243: aload_0
    //   244: ldc_w 1126
    //   247: invokevirtual 249	com/incorporateapps/fakegps/fre/Maps:getString	(I)Ljava/lang/String;
    //   250: astore_3
    //   251: new 344	android/app/AlertDialog$Builder
    //   254: dup
    //   255: aload_0
    //   256: invokespecial 347	android/app/AlertDialog$Builder:<init>	(Landroid/content/Context;)V
    //   259: astore 4
    //   261: aload 4
    //   263: ldc_w 1127
    //   266: invokevirtual 352	android/app/AlertDialog$Builder:setIcon	(I)Landroid/app/AlertDialog$Builder;
    //   269: pop
    //   270: aload 4
    //   272: aload_0
    //   273: ldc_w 1128
    //   276: invokevirtual 249	com/incorporateapps/fakegps/fre/Maps:getString	(I)Ljava/lang/String;
    //   279: invokevirtual 1131	android/app/AlertDialog$Builder:setTitle	(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
    //   282: pop
    //   283: aload 4
    //   285: aload_0
    //   286: ldc_w 361
    //   289: invokevirtual 249	com/incorporateapps/fakegps/fre/Maps:getString	(I)Ljava/lang/String;
    //   292: new 1133	com/incorporateapps/fakegps/fre/z
    //   295: dup
    //   296: aload_0
    //   297: invokespecial 1134	com/incorporateapps/fakegps/fre/z:<init>	(Lcom/incorporateapps/fakegps/fre/Maps;)V
    //   300: invokevirtual 1137	android/app/AlertDialog$Builder:setNegativeButton	(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    //   303: pop
    //   304: aload_0
    //   305: getfield 767	com/incorporateapps/fakegps/fre/Maps:o	Landroid/content/SharedPreferences;
    //   308: ldc_w 918
    //   311: aload_0
    //   312: getfield 111	com/incorporateapps/fakegps/fre/Maps:L	I
    //   315: invokeinterface 921 3 0
    //   320: istore_2
    //   321: new 1139	com/incorporateapps/fakegps/fre/aa
    //   324: dup
    //   325: aload_0
    //   326: invokespecial 1140	com/incorporateapps/fakegps/fre/aa:<init>	(Lcom/incorporateapps/fakegps/fre/Maps;)V
    //   329: astore 5
    //   331: aload 4
    //   333: iconst_2
    //   334: anewarray 1142	java/lang/CharSequence
    //   337: dup
    //   338: iconst_0
    //   339: aload_1
    //   340: aastore
    //   341: dup
    //   342: iconst_1
    //   343: aload_3
    //   344: aastore
    //   345: iload_2
    //   346: aload 5
    //   348: invokevirtual 1146	android/app/AlertDialog$Builder:setSingleChoiceItems	([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    //   351: pop
    //   352: aload_0
    //   353: aload 4
    //   355: invokevirtual 379	android/app/AlertDialog$Builder:create	()Landroid/app/AlertDialog;
    //   358: putfield 1148	com/incorporateapps/fakegps/fre/Maps:n	Landroid/app/AlertDialog;
    //   361: aload_0
    //   362: getfield 1148	com/incorporateapps/fakegps/fre/Maps:n	Landroid/app/AlertDialog;
    //   365: invokevirtual 384	android/app/AlertDialog:show	()V
    //   368: iconst_1
    //   369: ireturn
    //   370: new 344	android/app/AlertDialog$Builder
    //   373: dup
    //   374: aload_0
    //   375: invokespecial 347	android/app/AlertDialog$Builder:<init>	(Landroid/content/Context;)V
    //   378: astore_1
    //   379: aload_1
    //   380: ldc_w 1149
    //   383: invokevirtual 356	android/app/AlertDialog$Builder:setTitle	(I)Landroid/app/AlertDialog$Builder;
    //   386: pop
    //   387: new 1151	android/widget/EditText
    //   390: dup
    //   391: aload_0
    //   392: invokespecial 1152	android/widget/EditText:<init>	(Landroid/content/Context;)V
    //   395: astore_3
    //   396: aload_3
    //   397: ldc_w 1153
    //   400: invokevirtual 1156	android/widget/EditText:setHint	(I)V
    //   403: aload_1
    //   404: aload_3
    //   405: invokevirtual 1160	android/app/AlertDialog$Builder:setView	(Landroid/view/View;)Landroid/app/AlertDialog$Builder;
    //   408: pop
    //   409: aload_1
    //   410: ldc_w 1161
    //   413: new 1163	com/incorporateapps/fakegps/fre/ab
    //   416: dup
    //   417: aload_0
    //   418: aload_3
    //   419: invokespecial 1166	com/incorporateapps/fakegps/fre/ab:<init>	(Lcom/incorporateapps/fakegps/fre/Maps;Landroid/widget/EditText;)V
    //   422: invokevirtual 368	android/app/AlertDialog$Builder:setPositiveButton	(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    //   425: pop
    //   426: aload_1
    //   427: ldc_w 1167
    //   430: new 1169	com/incorporateapps/fakegps/fre/ac
    //   433: dup
    //   434: aload_0
    //   435: invokespecial 1170	com/incorporateapps/fakegps/fre/ac:<init>	(Lcom/incorporateapps/fakegps/fre/Maps;)V
    //   438: invokevirtual 375	android/app/AlertDialog$Builder:setNegativeButton	(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    //   441: pop
    //   442: aload_1
    //   443: invokevirtual 1172	android/app/AlertDialog$Builder:show	()Landroid/app/AlertDialog;
    //   446: pop
    //   447: iconst_1
    //   448: ireturn
    //   449: aload_0
    //   450: new 605	android/content/Intent
    //   453: dup
    //   454: invokespecial 1173	android/content/Intent:<init>	()V
    //   457: ldc_w 1175
    //   460: ldc_w 1177
    //   463: invokevirtual 1181	android/content/Intent:setClassName	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   466: invokevirtual 630	com/incorporateapps/fakegps/fre/Maps:startActivity	(Landroid/content/Intent;)V
    //   469: iconst_1
    //   470: ireturn
    //   471: aload_0
    //   472: getfield 803	com/incorporateapps/fakegps/fre/Maps:v	Lcom/google/android/gms/analytics/GoogleAnalytics;
    //   475: ldc_w 820
    //   478: invokevirtual 824	com/google/android/gms/analytics/GoogleAnalytics:newTracker	(I)Lcom/google/android/gms/analytics/Tracker;
    //   481: astore_1
    //   482: aload_1
    //   483: ldc_w 1183
    //   486: invokevirtual 831	com/google/android/gms/analytics/Tracker:setScreenName	(Ljava/lang/String;)V
    //   489: aload_1
    //   490: new 833	com/google/android/gms/analytics/HitBuilders$AppViewBuilder
    //   493: dup
    //   494: invokespecial 834	com/google/android/gms/analytics/HitBuilders$AppViewBuilder:<init>	()V
    //   497: invokevirtual 838	com/google/android/gms/analytics/HitBuilders$AppViewBuilder:build	()Ljava/util/Map;
    //   500: invokevirtual 842	com/google/android/gms/analytics/Tracker:send	(Ljava/util/Map;)V
    //   503: aload_0
    //   504: invokevirtual 1185	com/incorporateapps/fakegps/fre/Maps:c	()V
    //   507: iconst_1
    //   508: ireturn
    //   509: aload_0
    //   510: new 605	android/content/Intent
    //   513: dup
    //   514: aload_0
    //   515: ldc_w 1187
    //   518: invokespecial 903	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   521: invokevirtual 630	com/incorporateapps/fakegps/fre/Maps:startActivity	(Landroid/content/Intent;)V
    //   524: iconst_1
    //   525: ireturn
    //   526: aload_0
    //   527: invokevirtual 1191	com/incorporateapps/fakegps/fre/Maps:getPackageManager	()Landroid/content/pm/PackageManager;
    //   530: astore_1
    //   531: new 609	java/lang/StringBuilder
    //   534: dup
    //   535: ldc_w 1193
    //   538: invokespecial 612	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   541: aload_1
    //   542: ldc 2
    //   544: invokevirtual 1197	java/lang/Class:getPackage	()Ljava/lang/Package;
    //   547: invokevirtual 1202	java/lang/Package:getName	()Ljava/lang/String;
    //   550: iconst_0
    //   551: invokevirtual 1208	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   554: getfield 1213	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   557: invokevirtual 616	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   560: invokevirtual 617	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   563: astore_1
    //   564: new 609	java/lang/StringBuilder
    //   567: dup
    //   568: aload_0
    //   569: ldc_w 1214
    //   572: invokevirtual 249	com/incorporateapps/fakegps/fre/Maps:getString	(I)Ljava/lang/String;
    //   575: invokestatic 726	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   578: invokespecial 612	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   581: aload_1
    //   582: invokevirtual 616	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   585: invokevirtual 617	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   588: astore_1
    //   589: new 344	android/app/AlertDialog$Builder
    //   592: dup
    //   593: aload_0
    //   594: getfield 311	com/incorporateapps/fakegps/fre/Maps:l	Landroid/content/Context;
    //   597: invokespecial 347	android/app/AlertDialog$Builder:<init>	(Landroid/content/Context;)V
    //   600: ldc_w 348
    //   603: invokevirtual 352	android/app/AlertDialog$Builder:setIcon	(I)Landroid/app/AlertDialog$Builder;
    //   606: aload_1
    //   607: invokevirtual 1131	android/app/AlertDialog$Builder:setTitle	(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
    //   610: ldc_w 1215
    //   613: invokevirtual 360	android/app/AlertDialog$Builder:setMessage	(I)Landroid/app/AlertDialog$Builder;
    //   616: ldc_w 1001
    //   619: new 1217	com/incorporateapps/fakegps/fre/ad
    //   622: dup
    //   623: aload_0
    //   624: invokespecial 1218	com/incorporateapps/fakegps/fre/ad:<init>	(Lcom/incorporateapps/fakegps/fre/Maps;)V
    //   627: invokevirtual 368	android/app/AlertDialog$Builder:setPositiveButton	(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    //   630: invokevirtual 379	android/app/AlertDialog$Builder:create	()Landroid/app/AlertDialog;
    //   633: invokevirtual 384	android/app/AlertDialog:show	()V
    //   636: iconst_1
    //   637: ireturn
    //   638: astore_1
    //   639: aload_0
    //   640: invokevirtual 1185	com/incorporateapps/fakegps/fre/Maps:c	()V
    //   643: iconst_1
    //   644: ireturn
    //   645: astore_1
    //   646: ldc 113
    //   648: astore_1
    //   649: goto -85 -> 564
    //   652: aload_0
    //   653: invokespecial 1220	com/incorporateapps/fakegps/fre/Maps:i	()V
    //   656: iconst_1
    //   657: ireturn
    //   658: aload_0
    //   659: invokespecial 1220	com/incorporateapps/fakegps/fre/Maps:i	()V
    //   662: iconst_1
    //   663: ireturn
    //   664: goto -568 -> 96
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	667	0	this	Maps
    //   0	667	1	paramMenuItem	MenuItem
    //   320	26	2	i1	int
    //   250	169	3	localObject	Object
    //   259	95	4	localBuilder	AlertDialog.Builder
    //   329	18	5	localaa	aa
    // Exception table:
    //   from	to	target	type
    //   6	96	208	java/lang/Exception
    //   96	102	208	java/lang/Exception
    //   102	206	208	java/lang/Exception
    //   222	233	208	java/lang/Exception
    //   235	368	208	java/lang/Exception
    //   370	447	208	java/lang/Exception
    //   449	469	208	java/lang/Exception
    //   471	507	208	java/lang/Exception
    //   509	524	208	java/lang/Exception
    //   639	643	208	java/lang/Exception
    //   652	656	208	java/lang/Exception
    //   658	662	208	java/lang/Exception
    //   526	531	638	java/lang/Exception
    //   531	564	638	java/lang/Exception
    //   564	636	638	java/lang/Exception
    //   531	564	645	android/content/pm/PackageManager$NameNotFoundException
  }
  
  protected void onPause()
  {
    super.onPause();
    if (ac != null)
    {
      if (aa) {
        ac.disableMyLocation();
      }
      if (ab) {
        ac.disableCompass();
      }
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    Q = false;
    if (MyFunctions.b(l))
    {
      double d1 = o.getFloat("CurrentLat", 0.0F);
      double d2 = o.getFloat("CurrentLon", 0.0F);
      E = new GeoPoint(Double.valueOf(d1 * 1000000.0D).intValue(), Double.valueOf(d2 * 1000000.0D).intValue());
      a(E);
    }
    if (!((LocationManager)getSystemService("location")).isProviderEnabled("gps")) {
      f();
    }
  }
  
  protected void onStart()
  {
    super.onStart();
    try
    {
      GoogleAnalytics.getInstance(this).reportActivityStart(this);
      return;
    }
    catch (Exception localException) {}catch (UnsupportedOperationException localUnsupportedOperationException) {}
  }
  
  protected void onStop()
  {
    try
    {
      GoogleAnalytics.getInstance(this).reportActivityStop(this);
      super.onStop();
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      for (;;) {}
    }
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.Maps
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */