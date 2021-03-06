import { connect } from 'react-redux'
import ConfigParams from '../components/ConfigParams/ConfigParams'
import { actions } from '../modules/configParams.module'

const mapDispatchToProps = {
  ...actions
}

const mapStateToProps = (state) => ({
  configParams: state.configParams.configParams,
  paramDetail: state.configParams.paramDetail,
  updating: state.configParams.updating,
  updateError: state.configParams.updateError
})

export default connect(mapStateToProps, mapDispatchToProps)(ConfigParams)
