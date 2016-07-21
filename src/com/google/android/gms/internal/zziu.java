package com.google.android.gms.internal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.zzr;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class zziu
{
  private final Context mContext;
  private int mState = 0;
  private final float zzDB;
  private String zzMh;
  private float zzMi;
  private float zzMj;
  private float zzMk;
  
  public zziu(Context paramContext)
  {
    mContext = paramContext;
    zzDB = getResourcesgetDisplayMetricsdensity;
  }
  
  public zziu(Context paramContext, String paramString)
  {
    this(paramContext);
    zzMh = paramString;
  }
  
  private void showDialog()
  {
    if (!(mContext instanceof Activity))
    {
      zzin.zzaJ("Can not create dialog without Activity Context");
      return;
    }
    String str = zzaG(zzMh);
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(mContext);
    localBuilder.setMessage(str);
    localBuilder.setTitle("Ad Information");
    localBuilder.setPositiveButton("Share", new zziu.1(this, str));
    localBuilder.setNegativeButton("Close", new zziu.2(this));
    localBuilder.create().show();
  }
  
  static String zzaG(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      paramString = "No debug information";
    }
    Object localObject;
    do
    {
      return paramString;
      paramString = paramString.replaceAll("\\+", "%20");
      localObject = new Uri.Builder().encodedQuery(paramString).build();
      paramString = new StringBuilder();
      localObject = zzr.zzbC().zze((Uri)localObject);
      Iterator localIterator = ((Map)localObject).keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        paramString.append(str).append(" = ").append((String)((Map)localObject).get(str)).append("\n\n");
      }
      localObject = paramString.toString().trim();
      paramString = (String)localObject;
    } while (!TextUtils.isEmpty((CharSequence)localObject));
    return "No debug information";
  }
  
  /* Error */
  void zza(int paramInt, float paramFloat1, float paramFloat2)
  {
    // Byte code:
    //   0: iload_1
    //   1: ifne +24 -> 25
    //   4: aload_0
    //   5: iconst_0
    //   6: putfield 22	com/google/android/gms/internal/zziu:mState	I
    //   9: aload_0
    //   10: fload_2
    //   11: putfield 196	com/google/android/gms/internal/zziu:zzMi	F
    //   14: aload_0
    //   15: fload_3
    //   16: putfield 198	com/google/android/gms/internal/zziu:zzMj	F
    //   19: aload_0
    //   20: fload_3
    //   21: putfield 200	com/google/android/gms/internal/zziu:zzMk	F
    //   24: return
    //   25: aload_0
    //   26: getfield 22	com/google/android/gms/internal/zziu:mState	I
    //   29: iconst_m1
    //   30: if_icmpeq -6 -> 24
    //   33: iload_1
    //   34: iconst_2
    //   35: if_icmpne +212 -> 247
    //   38: fload_3
    //   39: aload_0
    //   40: getfield 198	com/google/android/gms/internal/zziu:zzMj	F
    //   43: fcmpl
    //   44: ifle +34 -> 78
    //   47: aload_0
    //   48: fload_3
    //   49: putfield 198	com/google/android/gms/internal/zziu:zzMj	F
    //   52: aload_0
    //   53: getfield 198	com/google/android/gms/internal/zziu:zzMj	F
    //   56: aload_0
    //   57: getfield 200	com/google/android/gms/internal/zziu:zzMk	F
    //   60: fsub
    //   61: ldc -55
    //   63: aload_0
    //   64: getfield 43	com/google/android/gms/internal/zziu:zzDB	F
    //   67: fmul
    //   68: fcmpl
    //   69: ifle +26 -> 95
    //   72: aload_0
    //   73: iconst_m1
    //   74: putfield 22	com/google/android/gms/internal/zziu:mState	I
    //   77: return
    //   78: fload_3
    //   79: aload_0
    //   80: getfield 200	com/google/android/gms/internal/zziu:zzMk	F
    //   83: fcmpg
    //   84: ifge -32 -> 52
    //   87: aload_0
    //   88: fload_3
    //   89: putfield 200	com/google/android/gms/internal/zziu:zzMk	F
    //   92: goto -40 -> 52
    //   95: aload_0
    //   96: getfield 22	com/google/android/gms/internal/zziu:mState	I
    //   99: ifeq +11 -> 110
    //   102: aload_0
    //   103: getfield 22	com/google/android/gms/internal/zziu:mState	I
    //   106: iconst_2
    //   107: if_icmpne +66 -> 173
    //   110: fload_2
    //   111: aload_0
    //   112: getfield 196	com/google/android/gms/internal/zziu:zzMi	F
    //   115: fsub
    //   116: ldc -54
    //   118: aload_0
    //   119: getfield 43	com/google/android/gms/internal/zziu:zzDB	F
    //   122: fmul
    //   123: fcmpl
    //   124: iflt +18 -> 142
    //   127: aload_0
    //   128: fload_2
    //   129: putfield 196	com/google/android/gms/internal/zziu:zzMi	F
    //   132: aload_0
    //   133: aload_0
    //   134: getfield 22	com/google/android/gms/internal/zziu:mState	I
    //   137: iconst_1
    //   138: iadd
    //   139: putfield 22	com/google/android/gms/internal/zziu:mState	I
    //   142: aload_0
    //   143: getfield 22	com/google/android/gms/internal/zziu:mState	I
    //   146: iconst_1
    //   147: if_icmpeq +11 -> 158
    //   150: aload_0
    //   151: getfield 22	com/google/android/gms/internal/zziu:mState	I
    //   154: iconst_3
    //   155: if_icmpne +69 -> 224
    //   158: fload_2
    //   159: aload_0
    //   160: getfield 196	com/google/android/gms/internal/zziu:zzMi	F
    //   163: fcmpl
    //   164: ifle -140 -> 24
    //   167: aload_0
    //   168: fload_2
    //   169: putfield 196	com/google/android/gms/internal/zziu:zzMi	F
    //   172: return
    //   173: aload_0
    //   174: getfield 22	com/google/android/gms/internal/zziu:mState	I
    //   177: iconst_1
    //   178: if_icmpeq +11 -> 189
    //   181: aload_0
    //   182: getfield 22	com/google/android/gms/internal/zziu:mState	I
    //   185: iconst_3
    //   186: if_icmpne -44 -> 142
    //   189: fload_2
    //   190: aload_0
    //   191: getfield 196	com/google/android/gms/internal/zziu:zzMi	F
    //   194: fsub
    //   195: ldc -53
    //   197: aload_0
    //   198: getfield 43	com/google/android/gms/internal/zziu:zzDB	F
    //   201: fmul
    //   202: fcmpg
    //   203: ifgt -61 -> 142
    //   206: aload_0
    //   207: fload_2
    //   208: putfield 196	com/google/android/gms/internal/zziu:zzMi	F
    //   211: aload_0
    //   212: aload_0
    //   213: getfield 22	com/google/android/gms/internal/zziu:mState	I
    //   216: iconst_1
    //   217: iadd
    //   218: putfield 22	com/google/android/gms/internal/zziu:mState	I
    //   221: goto -79 -> 142
    //   224: aload_0
    //   225: getfield 22	com/google/android/gms/internal/zziu:mState	I
    //   228: iconst_2
    //   229: if_icmpne -205 -> 24
    //   232: fload_2
    //   233: aload_0
    //   234: getfield 196	com/google/android/gms/internal/zziu:zzMi	F
    //   237: fcmpg
    //   238: ifge -214 -> 24
    //   241: aload_0
    //   242: fload_2
    //   243: putfield 196	com/google/android/gms/internal/zziu:zzMi	F
    //   246: return
    //   247: iload_1
    //   248: iconst_1
    //   249: if_icmpne -225 -> 24
    //   252: aload_0
    //   253: getfield 22	com/google/android/gms/internal/zziu:mState	I
    //   256: iconst_4
    //   257: if_icmpne -233 -> 24
    //   260: aload_0
    //   261: invokespecial 205	com/google/android/gms/internal/zziu:showDialog	()V
    //   264: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	265	0	this	zziu
    //   0	265	1	paramInt	int
    //   0	265	2	paramFloat1	float
    //   0	265	3	paramFloat2	float
  }
  
  public void zzaF(String paramString)
  {
    zzMh = paramString;
  }
  
  public void zze(MotionEvent paramMotionEvent)
  {
    int j = paramMotionEvent.getHistorySize();
    int i = 0;
    while (i < j)
    {
      zza(paramMotionEvent.getActionMasked(), paramMotionEvent.getHistoricalX(0, i), paramMotionEvent.getHistoricalY(0, i));
      i += 1;
    }
    zza(paramMotionEvent.getActionMasked(), paramMotionEvent.getX(), paramMotionEvent.getY());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zziu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */