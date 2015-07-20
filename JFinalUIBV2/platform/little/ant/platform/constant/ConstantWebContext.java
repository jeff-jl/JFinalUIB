package little.ant.platform.constant;

/**
 * web全局常用key
 */
public interface ConstantWebContext {

	/**
	 * web 路径
	 */
	public static final String cxt = "cxt";

	/**
	 * request cookie
	 */
	public static final String cookieMap = "cookieMap";

	/**
	 * request param
	 */
	public static final String paramMap = "paramMap";

	/**
	 * 国际化，设置request中的当前语言
	 */
	public static final String localePram = "localePram";

	/**
	 * 国际化，设置cookie中当前语言的key
	 */
	public static final String language = "language";

	/**
	 * 国际化，设置request中的当前语言map
	 */
	public static final String i18nMap = "i18nMap";

	/**
	 * 直接渲染模板的路径
	 */
	public static final String toUrl = "toUrl";

	/**
	 * 当前登录用户的id
	 */
	public static final String cUserIds = "cUserIds";

	/**
	 * 当前登录用户
	 */
	public static final String cUser = "cUser";

	/**
	 * 验证码key
	 */
	public static final String authCode = "authCode";

	/**
	 * 权限标示验证码
	 */
	public static final String authmark = "authmark";

	/**
	 * 排序方式
	 */
	public static final String orderMode = "orderMode";

	/**
	 * 第几页
	 */
	public static final String pageNumber = "pageNumber";
	
	/**
	 * 每页显示几多
	 */
	public static final String pageSize = "pageSize";
	
	/**
	 * 排序条件
	 */
	public static final String orderColunm = "orderColunm";

	/**
	 * 分页查询条件key前缀
	 */
	public static final String _query = "_query";

	/**
	 * 表单重复提交验证key
	 */
	public static final String formToken = "formToken";

	/**
	 * 表单重复提交验证token
	 */
	public static final String token = "token";

	
	
}
