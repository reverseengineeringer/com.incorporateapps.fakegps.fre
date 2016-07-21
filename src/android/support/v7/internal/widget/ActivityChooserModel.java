package android.support.v7.internal.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.support.v4.os.AsyncTaskCompat;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActivityChooserModel
  extends DataSetObservable
{
  private static final String ATTRIBUTE_ACTIVITY = "activity";
  private static final String ATTRIBUTE_TIME = "time";
  private static final String ATTRIBUTE_WEIGHT = "weight";
  private static final boolean DEBUG = false;
  private static final int DEFAULT_ACTIVITY_INFLATION = 5;
  private static final float DEFAULT_HISTORICAL_RECORD_WEIGHT = 1.0F;
  public static final String DEFAULT_HISTORY_FILE_NAME = "activity_choser_model_history.xml";
  public static final int DEFAULT_HISTORY_MAX_LENGTH = 50;
  private static final String HISTORY_FILE_EXTENSION = ".xml";
  private static final int INVALID_INDEX = -1;
  private static final String LOG_TAG = ActivityChooserModel.class.getSimpleName();
  private static final String TAG_HISTORICAL_RECORD = "historical-record";
  private static final String TAG_HISTORICAL_RECORDS = "historical-records";
  private static final Map sDataModelRegistry = new HashMap();
  private static final Object sRegistryLock = new Object();
  private final List mActivities = new ArrayList();
  private ActivityChooserModel.OnChooseActivityListener mActivityChoserModelPolicy;
  private ActivityChooserModel.ActivitySorter mActivitySorter = new ActivityChooserModel.DefaultSorter(this, null);
  private boolean mCanReadHistoricalData = true;
  private final Context mContext;
  private final List mHistoricalRecords = new ArrayList();
  private boolean mHistoricalRecordsChanged = true;
  private final String mHistoryFileName;
  private int mHistoryMaxSize = 50;
  private final Object mInstanceLock = new Object();
  private Intent mIntent;
  private boolean mReadShareHistoryCalled = false;
  private boolean mReloadActivities = false;
  
  private ActivityChooserModel(Context paramContext, String paramString)
  {
    mContext = paramContext.getApplicationContext();
    if ((!TextUtils.isEmpty(paramString)) && (!paramString.endsWith(".xml")))
    {
      mHistoryFileName = (paramString + ".xml");
      return;
    }
    mHistoryFileName = paramString;
  }
  
  private boolean addHisoricalRecord(ActivityChooserModel.HistoricalRecord paramHistoricalRecord)
  {
    boolean bool = mHistoricalRecords.add(paramHistoricalRecord);
    if (bool)
    {
      mHistoricalRecordsChanged = true;
      pruneExcessiveHistoricalRecordsIfNeeded();
      persistHistoricalDataIfNeeded();
      sortActivitiesIfNeeded();
      notifyChanged();
    }
    return bool;
  }
  
  private void ensureConsistentState()
  {
    boolean bool1 = loadActivitiesIfNeeded();
    boolean bool2 = readHistoricalDataIfNeeded();
    pruneExcessiveHistoricalRecordsIfNeeded();
    if ((bool1 | bool2))
    {
      sortActivitiesIfNeeded();
      notifyChanged();
    }
  }
  
  public static ActivityChooserModel get(Context paramContext, String paramString)
  {
    synchronized (sRegistryLock)
    {
      ActivityChooserModel localActivityChooserModel2 = (ActivityChooserModel)sDataModelRegistry.get(paramString);
      ActivityChooserModel localActivityChooserModel1 = localActivityChooserModel2;
      if (localActivityChooserModel2 == null)
      {
        localActivityChooserModel1 = new ActivityChooserModel(paramContext, paramString);
        sDataModelRegistry.put(paramString, localActivityChooserModel1);
      }
      return localActivityChooserModel1;
    }
  }
  
  private boolean loadActivitiesIfNeeded()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (mReloadActivities)
    {
      bool1 = bool2;
      if (mIntent != null)
      {
        mReloadActivities = false;
        mActivities.clear();
        List localList = mContext.getPackageManager().queryIntentActivities(mIntent, 0);
        int j = localList.size();
        int i = 0;
        while (i < j)
        {
          ResolveInfo localResolveInfo = (ResolveInfo)localList.get(i);
          mActivities.add(new ActivityChooserModel.ActivityResolveInfo(this, localResolveInfo));
          i += 1;
        }
        bool1 = true;
      }
    }
    return bool1;
  }
  
  private void persistHistoricalDataIfNeeded()
  {
    if (!mReadShareHistoryCalled) {
      throw new IllegalStateException("No preceding call to #readHistoricalData");
    }
    if (!mHistoricalRecordsChanged) {}
    do
    {
      return;
      mHistoricalRecordsChanged = false;
    } while (TextUtils.isEmpty(mHistoryFileName));
    AsyncTaskCompat.executeParallel(new ActivityChooserModel.PersistHistoryAsyncTask(this, null), new Object[] { mHistoricalRecords, mHistoryFileName });
  }
  
  private void pruneExcessiveHistoricalRecordsIfNeeded()
  {
    int j = mHistoricalRecords.size() - mHistoryMaxSize;
    if (j <= 0) {}
    for (;;)
    {
      return;
      mHistoricalRecordsChanged = true;
      int i = 0;
      while (i < j)
      {
        mHistoricalRecords.remove(0);
        i += 1;
      }
    }
  }
  
  private boolean readHistoricalDataIfNeeded()
  {
    if ((mCanReadHistoricalData) && (mHistoricalRecordsChanged) && (!TextUtils.isEmpty(mHistoryFileName)))
    {
      mCanReadHistoricalData = false;
      mReadShareHistoryCalled = true;
      readHistoricalDataImpl();
      return true;
    }
    return false;
  }
  
  /* Error */
  private void readHistoricalDataImpl()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 121	android/support/v7/internal/widget/ActivityChooserModel:mContext	Landroid/content/Context;
    //   4: aload_0
    //   5: getfield 145	android/support/v7/internal/widget/ActivityChooserModel:mHistoryFileName	Ljava/lang/String;
    //   8: invokevirtual 254	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   11: astore_2
    //   12: invokestatic 260	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   15: astore_3
    //   16: aload_3
    //   17: aload_2
    //   18: aconst_null
    //   19: invokeinterface 266 3 0
    //   24: iconst_0
    //   25: istore_1
    //   26: iload_1
    //   27: iconst_1
    //   28: if_icmpeq +18 -> 46
    //   31: iload_1
    //   32: iconst_2
    //   33: if_icmpeq +13 -> 46
    //   36: aload_3
    //   37: invokeinterface 269 1 0
    //   42: istore_1
    //   43: goto -17 -> 26
    //   46: ldc 40
    //   48: aload_3
    //   49: invokeinterface 272 1 0
    //   54: invokevirtual 275	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   57: ifne +52 -> 109
    //   60: new 248	org/xmlpull/v1/XmlPullParserException
    //   63: dup
    //   64: ldc_w 277
    //   67: invokespecial 278	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   70: athrow
    //   71: astore_3
    //   72: getstatic 72	android/support/v7/internal/widget/ActivityChooserModel:LOG_TAG	Ljava/lang/String;
    //   75: new 135	java/lang/StringBuilder
    //   78: dup
    //   79: ldc_w 280
    //   82: invokespecial 281	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   85: aload_0
    //   86: getfield 145	android/support/v7/internal/widget/ActivityChooserModel:mHistoryFileName	Ljava/lang/String;
    //   89: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   95: aload_3
    //   96: invokestatic 287	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   99: pop
    //   100: aload_2
    //   101: ifnull +7 -> 108
    //   104: aload_2
    //   105: invokevirtual 292	java/io/FileInputStream:close	()V
    //   108: return
    //   109: aload_0
    //   110: getfield 96	android/support/v7/internal/widget/ActivityChooserModel:mHistoricalRecords	Ljava/util/List;
    //   113: astore 4
    //   115: aload 4
    //   117: invokeinterface 198 1 0
    //   122: aload_3
    //   123: invokeinterface 269 1 0
    //   128: istore_1
    //   129: iload_1
    //   130: iconst_1
    //   131: if_icmpeq +140 -> 271
    //   134: iload_1
    //   135: iconst_3
    //   136: if_icmpeq -14 -> 122
    //   139: iload_1
    //   140: iconst_4
    //   141: if_icmpeq -19 -> 122
    //   144: ldc 37
    //   146: aload_3
    //   147: invokeinterface 272 1 0
    //   152: invokevirtual 275	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   155: ifne +54 -> 209
    //   158: new 248	org/xmlpull/v1/XmlPullParserException
    //   161: dup
    //   162: ldc_w 294
    //   165: invokespecial 278	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   168: athrow
    //   169: astore_3
    //   170: getstatic 72	android/support/v7/internal/widget/ActivityChooserModel:LOG_TAG	Ljava/lang/String;
    //   173: new 135	java/lang/StringBuilder
    //   176: dup
    //   177: ldc_w 280
    //   180: invokespecial 281	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   183: aload_0
    //   184: getfield 145	android/support/v7/internal/widget/ActivityChooserModel:mHistoryFileName	Ljava/lang/String;
    //   187: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   193: aload_3
    //   194: invokestatic 287	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   197: pop
    //   198: aload_2
    //   199: ifnull -91 -> 108
    //   202: aload_2
    //   203: invokevirtual 292	java/io/FileInputStream:close	()V
    //   206: return
    //   207: astore_2
    //   208: return
    //   209: aload 4
    //   211: new 296	android/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord
    //   214: dup
    //   215: aload_3
    //   216: aconst_null
    //   217: ldc 8
    //   219: invokeinterface 300 3 0
    //   224: aload_3
    //   225: aconst_null
    //   226: ldc 11
    //   228: invokeinterface 300 3 0
    //   233: invokestatic 306	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   236: aload_3
    //   237: aconst_null
    //   238: ldc 14
    //   240: invokeinterface 300 3 0
    //   245: invokestatic 312	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   248: invokespecial 315	android/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord:<init>	(Ljava/lang/String;JF)V
    //   251: invokeinterface 160 2 0
    //   256: pop
    //   257: goto -135 -> 122
    //   260: astore_3
    //   261: aload_2
    //   262: ifnull +7 -> 269
    //   265: aload_2
    //   266: invokevirtual 292	java/io/FileInputStream:close	()V
    //   269: aload_3
    //   270: athrow
    //   271: aload_2
    //   272: ifnull -164 -> 108
    //   275: aload_2
    //   276: invokevirtual 292	java/io/FileInputStream:close	()V
    //   279: return
    //   280: astore_2
    //   281: return
    //   282: astore_2
    //   283: return
    //   284: astore_2
    //   285: goto -16 -> 269
    //   288: astore_2
    //   289: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	290	0	this	ActivityChooserModel
    //   25	117	1	i	int
    //   11	192	2	localFileInputStream	java.io.FileInputStream
    //   207	69	2	localIOException1	java.io.IOException
    //   280	1	2	localIOException2	java.io.IOException
    //   282	1	2	localIOException3	java.io.IOException
    //   284	1	2	localIOException4	java.io.IOException
    //   288	1	2	localFileNotFoundException	java.io.FileNotFoundException
    //   15	34	3	localXmlPullParser	org.xmlpull.v1.XmlPullParser
    //   71	76	3	localXmlPullParserException	org.xmlpull.v1.XmlPullParserException
    //   169	68	3	localIOException5	java.io.IOException
    //   260	10	3	localObject	Object
    //   113	97	4	localList	List
    // Exception table:
    //   from	to	target	type
    //   12	24	71	org/xmlpull/v1/XmlPullParserException
    //   36	43	71	org/xmlpull/v1/XmlPullParserException
    //   46	71	71	org/xmlpull/v1/XmlPullParserException
    //   109	122	71	org/xmlpull/v1/XmlPullParserException
    //   122	129	71	org/xmlpull/v1/XmlPullParserException
    //   144	169	71	org/xmlpull/v1/XmlPullParserException
    //   209	257	71	org/xmlpull/v1/XmlPullParserException
    //   12	24	169	java/io/IOException
    //   36	43	169	java/io/IOException
    //   46	71	169	java/io/IOException
    //   109	122	169	java/io/IOException
    //   122	129	169	java/io/IOException
    //   144	169	169	java/io/IOException
    //   209	257	169	java/io/IOException
    //   202	206	207	java/io/IOException
    //   12	24	260	finally
    //   36	43	260	finally
    //   46	71	260	finally
    //   72	100	260	finally
    //   109	122	260	finally
    //   122	129	260	finally
    //   144	169	260	finally
    //   170	198	260	finally
    //   209	257	260	finally
    //   275	279	280	java/io/IOException
    //   104	108	282	java/io/IOException
    //   265	269	284	java/io/IOException
    //   0	12	288	java/io/FileNotFoundException
  }
  
  private boolean sortActivitiesIfNeeded()
  {
    if ((mActivitySorter != null) && (mIntent != null) && (!mActivities.isEmpty()) && (!mHistoricalRecords.isEmpty()))
    {
      mActivitySorter.sort(mIntent, mActivities, Collections.unmodifiableList(mHistoricalRecords));
      return true;
    }
    return false;
  }
  
  public Intent chooseActivity(int paramInt)
  {
    synchronized (mInstanceLock)
    {
      if (mIntent == null) {
        return null;
      }
      ensureConsistentState();
      Object localObject2 = (ActivityChooserModel.ActivityResolveInfo)mActivities.get(paramInt);
      localObject2 = new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
      Intent localIntent1 = new Intent(mIntent);
      localIntent1.setComponent((ComponentName)localObject2);
      if (mActivityChoserModelPolicy != null)
      {
        Intent localIntent2 = new Intent(localIntent1);
        if (mActivityChoserModelPolicy.onChooseActivity(this, localIntent2)) {
          return null;
        }
      }
      addHisoricalRecord(new ActivityChooserModel.HistoricalRecord((ComponentName)localObject2, System.currentTimeMillis(), 1.0F));
      return localIntent1;
    }
  }
  
  public ResolveInfo getActivity(int paramInt)
  {
    synchronized (mInstanceLock)
    {
      ensureConsistentState();
      ResolveInfo localResolveInfo = mActivities.get(paramInt)).resolveInfo;
      return localResolveInfo;
    }
  }
  
  public int getActivityCount()
  {
    synchronized (mInstanceLock)
    {
      ensureConsistentState();
      int i = mActivities.size();
      return i;
    }
  }
  
  public int getActivityIndex(ResolveInfo paramResolveInfo)
  {
    synchronized (mInstanceLock)
    {
      ensureConsistentState();
      List localList = mActivities;
      int j = localList.size();
      int i = 0;
      while (i < j)
      {
        if (getresolveInfo == paramResolveInfo) {
          return i;
        }
        i += 1;
      }
      return -1;
    }
  }
  
  public ResolveInfo getDefaultActivity()
  {
    synchronized (mInstanceLock)
    {
      ensureConsistentState();
      if (!mActivities.isEmpty())
      {
        ResolveInfo localResolveInfo = mActivities.get(0)).resolveInfo;
        return localResolveInfo;
      }
      return null;
    }
  }
  
  public int getHistoryMaxSize()
  {
    synchronized (mInstanceLock)
    {
      int i = mHistoryMaxSize;
      return i;
    }
  }
  
  public int getHistorySize()
  {
    synchronized (mInstanceLock)
    {
      ensureConsistentState();
      int i = mHistoricalRecords.size();
      return i;
    }
  }
  
  public Intent getIntent()
  {
    synchronized (mInstanceLock)
    {
      Intent localIntent = mIntent;
      return localIntent;
    }
  }
  
  public void setActivitySorter(ActivityChooserModel.ActivitySorter paramActivitySorter)
  {
    synchronized (mInstanceLock)
    {
      if (mActivitySorter == paramActivitySorter) {
        return;
      }
      mActivitySorter = paramActivitySorter;
      if (sortActivitiesIfNeeded()) {
        notifyChanged();
      }
      return;
    }
  }
  
  public void setDefaultActivity(int paramInt)
  {
    synchronized (mInstanceLock)
    {
      ensureConsistentState();
      ActivityChooserModel.ActivityResolveInfo localActivityResolveInfo1 = (ActivityChooserModel.ActivityResolveInfo)mActivities.get(paramInt);
      ActivityChooserModel.ActivityResolveInfo localActivityResolveInfo2 = (ActivityChooserModel.ActivityResolveInfo)mActivities.get(0);
      if (localActivityResolveInfo2 != null)
      {
        f = weight - weight + 5.0F;
        addHisoricalRecord(new ActivityChooserModel.HistoricalRecord(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name), System.currentTimeMillis(), f));
        return;
      }
      float f = 1.0F;
    }
  }
  
  public void setHistoryMaxSize(int paramInt)
  {
    synchronized (mInstanceLock)
    {
      if (mHistoryMaxSize == paramInt) {
        return;
      }
      mHistoryMaxSize = paramInt;
      pruneExcessiveHistoricalRecordsIfNeeded();
      if (sortActivitiesIfNeeded()) {
        notifyChanged();
      }
      return;
    }
  }
  
  public void setIntent(Intent paramIntent)
  {
    synchronized (mInstanceLock)
    {
      if (mIntent == paramIntent) {
        return;
      }
      mIntent = paramIntent;
      mReloadActivities = true;
      ensureConsistentState();
      return;
    }
  }
  
  public void setOnChooseActivityListener(ActivityChooserModel.OnChooseActivityListener paramOnChooseActivityListener)
  {
    synchronized (mInstanceLock)
    {
      mActivityChoserModelPolicy = paramOnChooseActivityListener;
      return;
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.ActivityChooserModel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */