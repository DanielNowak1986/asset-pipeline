package asset.pipeline.servlet


import javax.servlet.Filter
import javax.servlet.FilterChain
import javax.servlet.FilterConfig
import javax.servlet.ServletException
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse


class AssetPipelineDevFilter implements Filter {

	AssetPipelineDevFilterCore assetPipelineDevFilterCore = new AssetPipelineDevFilterCore()


	void setMapping(final String mapping) {
		assetPipelineDevFilterCore.mapping = mapping
	}

	@Override
	void init(final FilterConfig filterConfig) throws ServletException {
		assetPipelineDevFilterCore.servletContext = filterConfig.getServletContext()
	}

	@Override
	void destroy() {
	}

	@Override
	void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain) throws IOException, ServletException {
		assetPipelineDevFilterCore.doFilter(request, response, chain)
	}
}
